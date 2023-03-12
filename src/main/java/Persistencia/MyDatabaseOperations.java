package Persistencia;
import Modelo.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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

            sql = "INSERT INTO FABRICANTE(nome, pais_origem) VALUES (?, ?)";

            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, fbr.getNome());
            stm.setString(2, fbr.getPaisOrigem());
            stm.executeUpdate(sql);
           
            stm.close();
            connection.commit();
            connection.close();
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

            sql = "INSERT INTO MODELO(nome, capacidadePassageiros, capacidadeCarga, autonomia, id_fabricante) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, mdl.getNome());
            stm.setInt(2, mdl.getCapacidadePassageiros());
            stm.setInt(3, mdl.getCapacidadeCarga());
            stm.setInt(4, mdl.getAutonomia());
            stm.setInt(5, mdl.getFabricante().getId_fabricante());
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

            sql = "INSERT INTO AERONAVE(codigo , dataAquisicao, emAtividade, id_modelo) VALUES (?, ?, ?, ?)";

            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setInt(1, aero.getCod());
            stm.setDate(2, aero.getDataAquisicao());
            stm.setBoolean(3, aero.isEmAtividade());
            stm.setInt(4, aero.getModelo().getId_modelo());
            stm.executeUpdate(sql);

            stm.close();
            connection.commit();
            connection.close();
            myConexao.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyDatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static MyConnection executarConexao() {

        MyConnection myConnection = MyConnection.createMyConnection();
        myConnection.setDriver("org.postgresql.Driver");
        myConnection.setUrl("jdbc:postgresql://localhost:5432/");
        myConnection.setDatabaseName("DB_Companhia Aerea");
        myConnection.setUser("postgres");
        myConnection.setPassword("1234");

        return myConnection;
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
