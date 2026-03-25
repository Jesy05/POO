package Models.main;

import Models.Persona;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();

        Persona sara = new Persona("Sara", "Ruiz", LocalDate.of(2007, 8, 22), false);

        System.out.println(sara);

        int edad = Period.between(sara.getFechaNacimiento(), hoy).getYears();

        System.out.println(sara.getNombres() + " Tiene " + edad + " años.");
    }
}