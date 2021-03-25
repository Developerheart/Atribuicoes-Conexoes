package dao;

import models.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class lancamentoBook {

    private static Connection conn;

    public  static  void insert(Livro livro){
        try {
            conn = ConnectionFactory.criaConnection();
            String sqlToInsert = "INSERT INTO treinamento.Books (title, subtitle, author, numeroCap, numeroPag) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sqlToInsert);
            ps.setString(1, livro.getTitle());
            ps.setString(2, livro.getSubtitle());
            ps.setString(3, livro.getAuthor());
            ps.setInt(4, livro.getNumeroCap());
            ps.setInt(5, livro.getNumeroPag());
            ps.execute();
            System.out.println("Dados inseridos com sucesso");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Vamo rever esses codigos ae por favor!!!");
            e.printStackTrace();
        }finally {
            try {
                ConnectionFactory.fecharConnection(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Livro livro = new Livro("ordem e caos", "prelurdios", "unknow", 200, 13);
        insert(livro);
    }
}
