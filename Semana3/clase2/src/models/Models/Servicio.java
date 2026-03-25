package models.Models;

public class Servicio extends Producto {
    private String descripcion;
    private double tipo;

    // ok y select none
    public Servicio() {
    }

    public Servicio(String nombre, double precio, int cantidad, String descripcion) {
        super(nombre, precio, cantidad);
        this.descripcion = descripcion;
    }

    // ahora se seleccionan los dos
    public Servicio(String nombre, double precio, int cantidad, String descripcion, double tipo) {
        super(nombre, precio, cantidad);
        this.descripcion = descripcion;
        this.tipo = tipo;
    }


    //select both (gettersetter)

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTipo() {
        return tipo;
    }

    public void setTipo(double tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
