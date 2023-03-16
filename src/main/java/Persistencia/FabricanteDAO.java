package Persistencia;

import Modelo.Fabricante;
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
public class FabricanteDAO {

    public static int inserirFabricante(Fabricante fbr) throws SQLException, ClassNotFoundException {

        MyConnection.obterConexao().setAutoCommit(false);

        String sql = "INSERT INTO FABRICANTE (nome, pais_origem) VALUES (?, ?)";
        int id = -1;

        PreparedStatement stm = MyConnection.obterConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stm.setString(1, fbr.getNome());
        stm.setString(2, fbr.getPaisOrigem());

        stm.execute();

        ResultSet rs = stm.getGeneratedKeys();

        if (rs.next()) {
            id = rs.getInt(1);
        }

        stm.close();

        return id;
    }

    public static List<Fabricante> listarFabricantes() throws SQLException, ClassNotFoundException {

        List<Fabricante> fabricantes = new ArrayList();

        String sql = "SELECT * FROM FABRICANTE;";

        Statement stm = MyConnection.obterConexao().createStatement();

        ResultSet rs = stm.executeQuery(sql);

        while (rs.next()) {
            Fabricante fbr = new Fabricante(rs.getString(2), rs.getString(3));
            fbr.setId_fabricante(rs.getInt(1));
            fabricantes.add(fbr);
        }

        return fabricantes;
    }
}
