package Run;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Ingresa un numero:",
                "Tabla de multiplicacion",
                JOptionPane.INFORMATION_MESSAGE));

        String tabla = "Tabla de multiplicacion";

        for (int i = 1; i <= 12; i++) {
            tabla += " " + i + " * " + num + " = " + (num * i)+"\n";
        }

        JOptionPane.showMessageDialog(
                null,
                tabla,  "Tabla de multiplicacion",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
