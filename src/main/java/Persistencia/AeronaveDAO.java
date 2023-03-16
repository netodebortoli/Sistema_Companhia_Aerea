package Persistencia;

import Modelo.Aeronave;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SAMSUNG
 */
public class AeronaveDAO {

    public static int inserirAeronave(Aeronave aero) throws SQLException, ClassNotFoundException {

        MyConnection.conexao.setAutoCommit(false);

        String sql = "INSERT INTO AERONAVE(codigo, dataAquisicao, emAtividade, id_modelo) VALUES (?, ?, ?, ?)";
        int id = -1;

        PreparedStatement stm = MyConnection.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        stm.setInt(1, aero.getCod());
        stm.setDate(2, new java.sql.Date(aero.getDataAquisicao().getTime()));
        stm.setBoolean(3, aero.isEmAtividade());
        stm.setInt(4, aero.getModelo().getId_modelo());

        stm.execute();

        ResultSet rs = stm.getGeneratedKeys();

        if (rs.next()) {
            id = rs.getInt(1);
        }

        stm.close();

        return id;
    }

    public static boolean validarCodigoAeronave(int codigo) throws SQLException, ClassNotFoundException {

        MyConnection.conexao.setAutoCommit(false);

        String sql = "SELECT id_aeronave FROM AERONAVE WHERE codigo = ?;";

        PreparedStatement stm = MyConnection.obterConexao().prepareStatement(sql);
        stm.setInt(1, codigo);

        ResultSet rs;
        rs = stm.executeQuery();
        boolean idEncontrado;
        idEncontrado = rs.next();

        rs.close();
        stm.close();

        //Se existe retorna TRUE
        return idEncontrado;
    }
}
