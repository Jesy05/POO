package Run;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
        String[] opciones = {"Fibonachi", "Calcular factorial"};

        int seleccion = JOptionPane.showOptionDialog(null,
                "Seleccionar la operacion",
                "Menú Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion == 0) {
            int inicio = Integer.parseInt(JOptionPane.showInputDialog("Dime el número inicial:"));
            int fin = Integer.parseInt(JOptionPane.showInputDialog("Dime el número final:"));

            int i = inicio + 1;
            String texto = "";
            while (i < fin) {
                if (i % 2 == 0) {
                    texto += i + "\n";
                }
                i++;
            }
            JOptionPane.showMessageDialog(null, "Números pares:\n" + texto);

        } else if (seleccion == 1) {
            int i = Integer.parseInt(JOptionPane.showInputDialog("Dime un número para su factorial:"));
            long factorial = 1;


            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            JOptionPane.showMessageDialog(null, "El factorial de " + i + " es:\n" + factorial);
        }
    }
}