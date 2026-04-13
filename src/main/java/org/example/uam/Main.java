package org.example.uam;

import javax.swing.JOptionPane;
import org.example.mode.Persona;
import org.example.org.example.services.PersonaServices;

public class Main {
    public static void main(String[] args) {
        int opcion;
        String nombre, apellidos, email;
        double salario;

        String pantalla = "--- MENÚ DE REGISTRO ---\n1. Agregar Persona\n2. Ver Registros\n0. Salir";
        PersonaServices registros = new PersonaServices();

        do {
            String input = JOptionPane.showInputDialog(null, pantalla);
            if (input == null) {
                break;
            }
            
            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.");
                opcion = -1;
                continue;
            }

            switch (opcion) {
                case 1:
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    apellidos = JOptionPane.showInputDialog(null, "Apellidos: ");
                    email = JOptionPane.showInputDialog(null, "Email: ");
                    
                    try {
                        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));
                    } catch (NumberFormatException | NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Salario inválido, se guardará como 0.0");
                        salario = 0.0;
                    }
                    registros.agregarPersona(nombre, apellidos, email, salario);
                    JOptionPane.showMessageDialog(null, "Persona agregada con éxito!");
                    break;

                case 2:
                    // Ver registros
                    Persona[] listaPersonas = registros.getPersonas();
                    if (listaPersonas == null || listaPersonas.length == 0) {
                        JOptionPane.showMessageDialog(null, "No hay personas registradas.");
                    } else {
                        StringBuilder mensaje = new StringBuilder("--- REGISTROS ---\n\n");
                        for (int i = 0; i < listaPersonas.length; i++) {
                            Persona p = listaPersonas[i];
                            mensaje.append(i + 1).append(". ")
                                   .append(p.getNombre()).append(" ")
                                   .append(p.getApellido()).append(" - ")
                                   .append(p.getEmail()).append(" - $")
                                   .append(p.getSalario()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, mensaje.toString());
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        } while (opcion != 0);
    }
}