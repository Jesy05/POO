package main;

import models.Models.Producto;
import models.Models.Laptops;
import models.Models.Servicio;

public class Main {
    public static void main(String[] args) {
        Producto cafe = new Producto();
        cafe.setNombre("Cafe");
        cafe.setPrecio(10.5);
        cafe.setCantidad(100);

        System.out.println(cafe);


        Producto galletas = new Producto();
        galletas.setNombre("galletas");
        galletas.setPrecio(133);
        galletas.setCantidad(10);

        System.out.println(galletas);

        Laptops DELL = new Laptops();
        DELL.setNombre("DELL Latitude");
        DELL.setPrecio(10.5);
        DELL.setCantidad(10);
        System.out.println(DELL);

        // una clase puede tener hijos y los hijos heredan atributos y metodos de sus padres

        Servicio taxi = new Servicio();
        taxi.setDescripcion("llevar gente");
        taxi.setTipo(1);
        System.out.println(taxi);

        Producto agua = new Producto();
        agua.setNombre("Agua");
        agua.setPrecio(120);
        agua.setCantidad(2);
        System.out.println(agua);

        //polimorfismo es cuando algo se comporta de diferentes maneras
    }
}
