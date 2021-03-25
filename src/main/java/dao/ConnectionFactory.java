package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String USUARIO_DB = "root";
    private static final String SENHA_DB = "1234";
    private static final String URL_DB = "jdbc:mysql://localhost:3306/treinamento?useTimezone=true&serverTimezone=Brazil/Acre";


    public static Connection criaConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL_DB, USUARIO_DB, SENHA_DB);
        return conn;
    }

    public static void fecharConnection(Connection connection) throws SQLException {
        connection.close();
    }





    public static void main(String[] args) {
        try {
            criaConnection();
            System.out.println("Conexão com sucesso");

        } catch (Exception error) {
            System.out.println(error.getMessage());
            error.printStackTrace();

        }


    }




}
