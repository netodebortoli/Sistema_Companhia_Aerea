package Persistencia;

import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDatabaseOperations {

    public static void inserirFabricante(Fabricante fbr) {
        try {

            MyConnection myConexao = executarConexao();

            Connection connection = myConexao.getConnection();

            connection.setAutoCommit(false);

            String sql = "";

            sql = "INSERT INTO FABRICANTE(id_fabricante, nome, pais_origem) VALUES (" + fbr.getId_fabricante() + ", '" + fbr.getNome() + "','" + fbr.getPaisOrigem() + "')";

            Statement stm = connection.createStatement();

            stm.executeUpdate(sql);

            stm.close();
            connection.commit();

            myConexao.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
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
                    + mdl.getFabricante() + "')";

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
                    + aero.getModelo() + "')";

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
        myConnection.setUrl("jdbc:postgresql://localhost:3306/");
        myConnection.setDatabaseName("DB_Companhia Aerea");
        myConnection.setUser("postgres");
        myConnection.setPassword("postgres");

        return myConnection;
    }

    public static boolean validarIdFabricante(int id_fabricante) {
        try {

            MyConnection myConexao = executarConexao();

            Connection connection = myConexao.getConnection();

            String sql = "";

            sql = "SELECT id_fabricante FROM Fabricante WHERE id_fabricante = " + id_fabricante + ";";

            Statement stm = connection.createStatement();
            ResultSet rs;

            rs = stm.executeQuery(sql);
            boolean idEncontrado;

            idEncontrado = rs.next();

            rs.close();
            stm.close();

            myConexao.closeConnection();

            return idEncontrado;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean validarIdAeronave(int id_aeronave) {
        try {

            MyConnection myConexao = executarConexao();

            Connection connection = myConexao.getConnection();

            String sql = "";

            sql = "SELECT id_aeronave FROM AERONAVE WHERE id_aeronave = " + id_aeronave + ";";

            Statement stm = connection.createStatement();
            ResultSet rs;

            rs = stm.executeQuery(sql);
            boolean idEncontrado;

            idEncontrado = rs.next();

            rs.close();
            stm.close();

            myConexao.closeConnection();

            return idEncontrado;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void selectFabricanteOuModelo(String nomeClasse) {

        try {

            String nome;
            MyConnection myConexao = executarConexao();
            Connection connection = myConexao.getConnection();

            Statement statement = connection.createStatement();
            ResultSet rs;

            if (nomeClasse.equals("Fabricante")) {
                rs = statement.executeQuery("SELECT nome FROM FABRICANTE");
            } else {
                rs = statement.executeQuery("SELECT nome FROM MODELO");
            }

            while (rs.next()) {
                nome = rs.getString(2);
                System.out.println("Nome: " + nome);
            }

            rs.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
