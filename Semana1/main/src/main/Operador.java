package main;

public class Operador {
    public static void main(String[] args) {
        int numero1 = 3, numero2 = 10;
        String Numero1, Numero2;
        Numero1 = "" + numero1;
        Numero2 = "" + numero2;


        System.out.println(numero1 + "+" + Numero2 + "=" + (numero1 + numero2));
        System.out.println(numero1 + "+" + Numero2 + "=" + (Numero1 + Numero2));
        System.out.println(numero1 + " - " + numero2 + "=" + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + "=" + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + "=" + ((float) numero1 / (float) numero2));
        System.out.println(numero1 + " % " + numero2 + "=" + (numero1 % numero2));
        System.out.println(numero1 + " > " + numero2 + "=" + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + "=" + (numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + "=" + (numero1 >= numero2));
        System.out.println(numero1 + " == " + numero2 + "=" + (numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + "=" + (numero1 != numero2));

    }
}