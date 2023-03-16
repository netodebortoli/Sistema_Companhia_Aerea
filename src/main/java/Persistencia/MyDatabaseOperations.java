package Persistencia;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDatabaseOperations {

    public static int inserirFabricante(Fabricante fbr) {
        try {

            MyConnection myConexao = executarConexao();

            Connection connection = myConexao.getConnection();

            connection.setAutoCommit(false);

            String sql;
            int id = 0;
            // sql = "INSERT INTO FABRICANTE(id_fabricante, nome, pais_origem) VALUES ( '" + fbr.getNome() + "','" + fbr.getPaisOrigem() + "')";

            sql = "INSERT INTO FABRICANTE (nome, pais_origem) VALUES (?, ?)";

            //Statement stm = connection.createStatement();
            PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stm.setString(1, fbr.getNome());
            stm.setString(2, fbr.getPaisOrigem());

            stm.execute();

            ResultSet rs = stm.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            stm.close();
            connection.commit();
            connection.close();
            myConexao.closeConnection();
            return id;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public static void inserirModelo(Modelo mdl) {
        try {

            MyConnection myConexao = executarConexao();

            Connection connection = myConexao.getConnection();

            connection.setAutoCommit(false);

            String sql = "";

            sql = "INSERT INTO MODELO(nome, capacidadePassageiros, capacidadeCarga, autonomia, id_fabricante) VALUES ('"
                    + mdl.getNome() + "','"
                    + mdl.getCapacidadePassageiros() + "','"
                    + mdl.getCapacidadeCarga() + "','"
                    + mdl.getAutonomia() + "','"
                    + mdl.getFabricante().getId_fabricante() + "')";

            Statement stm = connection.createStatement();

            stm.executeUpdate(sql);

            stm.close();
            connection.commit();
            connection.close();
            myConexao.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void inserirAeronave(Aeronave aero) {
        try {

            MyConnection myConexao = executarConexao();

            Connection connection = myConexao.getConnection();

            connection.setAutoCommit(false);

            String sql = "";

            sql = "INSERT INTO AERONAVE(codigo, dataAquisicao, emAtividade, id_modelo) VALUES ('"
                    + aero.getCod() + "','"
                    + aero.getDataAquisicao() + "','"
                    + aero.isEmAtividade() + "','"
                    + aero.getModelo().getId_modelo() + "')";

            Statement stm = connection.createStatement();

            stm.executeUpdate(sql);

            stm.close();
            connection.commit();
            connection.close();
            myConexao.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static MyConnection executarConexao() {

        MyConnection myConnection = MyConnection.createMyConnection();
        myConnection.setDriver("org.postgresql.Driver");
        myConnection.setUrl("jdbc:postgresql://localhost:5432/");
        myConnection.setDatabaseName("DB_Companhia_Aerea");
        myConnection.setUser("postgres");
        myConnection.setPassword("1234");

        return myConnection;
    }

    public static Vector getAllFabricantes() {

        try {
            Vector fabricantes = new Vector();
            MyConnection myConexao = executarConexao();
            Connection connection = myConexao.getConnection();

            String sql = "SELECT * FROM FABRICANTE;";
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                Fabricante fbr = new Fabricante(rs.getString(2), rs.getString(3));
                fbr.setId_fabricante(rs.getInt(1));
                fabricantes.add(fbr);
            }
            rs.close();
            stm.close();
            return fabricantes;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
        public static Vector getAllModelos() {

        try {
            Vector modelos = new Vector();
            MyConnection myConexao = executarConexao();
            Connection connection = myConexao.getConnection();

            String sql = "SELECT * FROM MODELO;";
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                Modelo mdl = new Modelo(rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), null);
                mdl.setId_modelo(rs.getInt(1));
                modelos.add(mdl);
            }
            rs.close();
            stm.close();
            return modelos;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
