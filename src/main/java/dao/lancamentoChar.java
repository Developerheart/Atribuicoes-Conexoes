package dao;

import enums.Classe;
import enums.Regiao;
import models.Char;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class lancamentoChar{

    private static Connection conn;


    public static void insert(Char character){

            try {
                conn = ConnectionFactory.criaConnection();
                String sqlToInsert = "INSERT INTO treinamento.character (name, age, level, classe, regiao) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sqlToInsert);
                ps.setString(1, character.getName());
                ps.setInt(2, character.getAge());
                ps.setInt(3, character.getLevel());
                ps.setString(4, character.getClasse());
                ps.setString(5, character.getRegiao());
                ps.execute();
                System.out.println("Dados inseridos com sucesso!!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Vamo rever esses codigos ae por favor!!!");
                e.printStackTrace();
            }finally{
                try {
                    ConnectionFactory.fecharConnection(conn);
                    System.out.println("Conexao fechada!");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }



    }

    public static void main(String[] args) {
        Char ch = new Char("leonardo", 18, 10, Classe.NECROMANCER, Regiao.ASGARD );
        insert(ch);
    }

}
