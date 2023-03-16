package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    static Connection conexao;

    public static Connection obterConexao() throws SQLException, ClassNotFoundException {

        String server = "localhost:5432";
        String login = "postgres";
        String password = "123";
        String dataBase = "DB_Companhia_Aerea";
        String url = "jdbc:postgresql://" + server + "/" + dataBase;

        Class.forName("org.postgresql.Driver");
        conexao = DriverManager.getConnection(url, login, password);

        return conexao;
    }
}
