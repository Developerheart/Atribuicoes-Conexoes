package models;

import enums.ModeloFreio;

import java.io.Serializable;

public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String motor;
    private ModeloFreio freio;
    private String modelo;
    private String marca;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Carro(Integer id, String motor, ModeloFreio freio, String modelo, String marca) {
        this.id = id;
        this.motor = motor;
        this.freio = freio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getFreio() {
        return freio.toString();
    }

    public void setFreio(ModeloFreio freio) {
        this.freio = freio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carro carro = (Carro) o;

        if (!motor.equals(carro.motor)) return false;
        if (freio != carro.freio) return false;
        if (!modelo.equals(carro.modelo)) return false;
        return marca.equals(carro.marca);
    }

    @Override
    public int hashCode() {
        int result = motor.hashCode();
        result = 31 * result + freio.hashCode();
        result = 31 * result + modelo.hashCode();
        result = 31 * result + marca.hashCode();
        return result;
    }

    public Integer getId() {
        return id;
    }


}
