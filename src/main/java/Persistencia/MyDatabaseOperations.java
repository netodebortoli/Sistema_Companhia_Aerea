package Persistencia;

import Modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDatabaseOperations {

    public static int inserirFabricante(Fabricante fbr) {
        try {

            MyConnectionBD.obterConexao().setAutoCommit(false);

            String sql = "INSERT INTO FABRICANTE (nome, pais_origem) VALUES (?, ?)";
            int id = 0;

            PreparedStatement stm = MyConnectionBD.obterConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stm.setString(1, fbr.getNome());
            stm.setString(2, fbr.getPaisOrigem());

            stm.execute();

            ResultSet rs = stm.getGeneratedKeys();

            if (rs.next()) {
                id = rs.getInt(1);
            }

            stm.close();

            return id;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public static int inserirModelo(Modelo mdl) {
        try {

            MyConnectionBD.obterConexao().setAutoCommit(false);

            String sql = "INSERT INTO MODELO(nome, capacidadePassageiros, capacidadeCarga, autonomia, id_fabricante) VALUES (?, ?, ?, ?, ?)";
            int id = 0;

            PreparedStatement stm = MyConnectionBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            stm.setString(1, mdl.getNome());
            stm.setInt(2, mdl.getCapacidadePassageiros());
            stm.setInt(3, mdl.getCapacidadeCarga());
            stm.setInt(4, mdl.getAutonomia());
            stm.setInt(5, mdl.getFabricante().getId_fabricante());

            stm.execute();

            ResultSet rs = stm.getGeneratedKeys();

            if (rs.next()) {
                id = rs.getInt(1);
            }

            stm.close();

            return id;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public static int inserirAeronave(Aeronave aero) {
        try {

            MyConnectionBD.conexao.setAutoCommit(false);

            String sql = "INSERT INTO AERONAVE(codigo, dataAquisicao, emAtividade, id_modelo) VALUES (?, ?, ?, ?)";
            int id = 0;

            PreparedStatement stm = MyConnectionBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            stm.setInt(1, aero.getCod());
            stm.setString(2, aero.getDataAquisicao());
            stm.setBoolean(3, aero.isEmAtividade());
            stm.setInt(4, aero.getModelo().getId_modelo());

            stm.execute();

            ResultSet rs = stm.getGeneratedKeys();

            if (rs.next()) {
                id = rs.getInt(1);
            }

            stm.close();

            return id;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public static List<Fabricante> listarFabricantes() {

        try {

            List<Fabricante> fabricantes = new ArrayList();

            String sql = "SELECT * FROM FABRICANTE;";

            Statement stm = MyConnectionBD.obterConexao().createStatement();

            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                Fabricante fbr = new Fabricante(rs.getString(2), rs.getString(3));
                fbr.setId_fabricante(rs.getInt(1));
                fabricantes.add(fbr);
            }

            return fabricantes;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static List<Modelo> listarModelos() {

        try {

            List<Modelo> modelos = new ArrayList();

            String sql = "SELECT * FROM MODELO;";

            Statement stm = MyConnectionBD.obterConexao().createStatement();

            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                Modelo mdl = new Modelo(rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), null);
                mdl.setId_modelo(rs.getInt(1));
                modelos.add(mdl);
            }

            return modelos;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
