package dao;

import enums.ModeloFreio;
import models.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class lancamentoCar {
    private  static Connection conn;

    public static void insert(Carro car) throws SQLException {
        try {
            conn =  ConnectionFactory.criaConnection();
            String sqlToInsert = "INSERT INTO treinamento.Carros (motor, modelofreio, modelo, marca) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sqlToInsert);
            ps.setString(1, car.getMotor());
            ps.setString(2, car.getFreio());
            ps.setString(3, car.getModelo());
            ps.setString(4, car.getMarca());
            ps.execute();
            System.out.println("Concluido com sucesso");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Vamo rever esses codigos ae por favor!!!");
            e.printStackTrace();
        }finally {
            ConnectionFactory.fecharConnection(conn);
        }
    }

    public static void main(String[] args) throws SQLException {
        Carro car =  new Carro(1, "Citroen", ModeloFreio.ABS , "4.0", "HONDA");
        insert(car);

    }
}
