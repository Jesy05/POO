package models;

public class Vehiculos {
    //atributos privados
    private String marca;
    private String modelo;
    private String color;

    //constructor vacio

    public Vehiculos() {
    }

    // constructor con parametros

    public Vehiculos(String modelo, String marca, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    //getters setters


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
