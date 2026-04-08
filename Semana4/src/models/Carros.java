package models;

public class Carros extends Vehiculos{
    //atributo unico
    private int ram;

    //constructor


    public Carros(String modelo, String marca, String color, int ram) {
        super(modelo, marca, color);
        this.ram = ram;
    }

    public Carros(int ram) {
        this.ram = ram;
    }
  //gettersetter
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "ram=" + ram +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
