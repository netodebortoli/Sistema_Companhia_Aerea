package Persistencia;

import Modelo.Modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SAMSUNG
 */
public class ModeloDAO {

    public static int inserirModelo(Modelo mdl) throws SQLException, ClassNotFoundException {

        MyConnection.obterConexao().setAutoCommit(false);

        String sql = "INSERT INTO MODELO(nome, capacidadePassageiros, capacidadeCarga, autonomia, id_fabricante) VALUES (?, ?, ?, ?, ?)";
        int id = -1;

        PreparedStatement stm = MyConnection.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

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
    }

    public static List<Modelo> listarModelos() throws SQLException, ClassNotFoundException {

        List<Modelo> modelos = new ArrayList();

        String sql = "SELECT * FROM MODELO;";

        Statement stm = MyConnection.obterConexao().createStatement();

        ResultSet rs = stm.executeQuery(sql);

        while (rs.next()) {
            Modelo mdl = new Modelo(rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), null);
            mdl.setId_modelo(rs.getInt(1));
            modelos.add(mdl);
        }

        return modelos;

    }
}
