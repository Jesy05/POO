package models.Models;

public class Producto {

    // CLASE TIENE nombre, atributos, metodos
    //Clase publica, metodos privados

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //constructor solo con nombre y precio
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;


    }
}
