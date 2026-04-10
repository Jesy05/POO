package org.example.org.example.services;

import org.example.mode.Persona;

public class PersonaServices {
    private Persona[] personas;

    public PersonaServices() {
        this.personas = new Persona[0];
    }

    public PersonaServices(Persona[] personas) {
        this.personas = personas;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    public void agregarPersona(String nombre, String apellidos, 
                                String email, double salario){
        Persona nuevaPersona = new Persona(nombre, apellidos, email, String.valueOf(salario));
        
        if (this.personas == null) {
            this.personas = new Persona[]{nuevaPersona};
        } else {
            Persona[] nuevoArreglo = new Persona[this.personas.length + 1];
            System.arraycopy(this.personas, 0, nuevoArreglo, 0, this.personas.length);
            nuevoArreglo[this.personas.length] = nuevaPersona;
            this.personas = nuevoArreglo;
        }
    }
    
}
