package Run;

import javax.swing.*;

public class ejercicio2 {
    // Pedir dos numeros y mostrar los numeros pares entre ellos
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane
                .showInputDialog("Dime un numero:"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog("Dime otro numero:"));

        int i = inicio + 1;
        String texto = "";
        while (i < fin) {
            if (i % 2 == 0) {
                texto += i + "\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}
