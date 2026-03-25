package Models;

import java.time.LocalDate;

public class Persona {
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private boolean sexo;

    public Persona(String nombres, String apellidos, LocalDate fechaNacimiento, boolean sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    // Estos son los métodos que Main está buscando:
    public String getNombres() {
        return nombres;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombres + " " + apellidos;
    }
}