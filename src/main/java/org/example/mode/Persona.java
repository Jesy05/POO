package org.example.mode;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String salario;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }


    //equals and hash code n then pres next till create

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(email, persona.email) && Objects.equals(salario, persona.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, email, salario);
    }
}
