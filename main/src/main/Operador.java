package main;

public class Operador {
    public static void main(String[] args) {
        int numero1 = 3, numero2 = 10;

        System.out.println(numero1 + "+" + numero2 + "=" + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + "=" + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + "=" + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + "=" + ((float) numero1 / (float) numero2));
    }
}