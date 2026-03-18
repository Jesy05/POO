package Run;
// ejercicio1
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int num= 0;
        try{
            num = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Ingresa un numero:",
                    "Tabla de multiplicación",
                    JOptionPane.INFORMATION_MESSAGE));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,
                    " Error al ingresar un número",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        String tabla = "Tabla de multiplicación \n";

        for (int i = 1; i <= 12; i++) {
            tabla += " " + i + " * " + num + " = " + (num * i) + "\n";
        }

        JOptionPane.showMessageDialog(
                null,
                tabla,  "Tabla de multiplicacion",
                JOptionPane.INFORMATION_MESSAGE);
    }
}