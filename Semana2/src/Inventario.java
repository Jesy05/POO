
//  El dilema del Inventario
// Un sistema de logística debe decidir el método de envío.
// • Regla A: Si el peso es > 50kg y la distancia > 100km, usar “Transporte pesado”.
// • Regla B: Si el peso es < 50kg pero el producto es “Frágil”, usar “Envío Premium”.
// • Regla C: Si el peso es < 10kg y la distancia < 20km, usar “Dron”.

import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {

        // Creamos nuestro lector (le llamaremos "teclado")
        // System.in significa que leerá la "entrada del sistema" (el teclado)
        Scanner teclado = new Scanner(System.in);

        // GUARDAR LOS DATOS

        System.out.print("Ingresa el peso del paquete (en kg): ");
        double peso = teclado.nextDouble();

        System.out.print("Ingresa la distancia de envío (en km): ");
        double distancia = teclado.nextDouble(); // Espera otro número

        System.out.print("¿El producto es frágil? (escribe true para SÍ, o false para NO): ");
        boolean esFragil = teclado.nextBoolean();

        // APLICAR LAS REGLAS DE LOGÍSTICA

        System.out.println("--------------------------------------");
        System.out.println("Calculando el mejor método de envío...");

        // REGLA A
        if (peso > 50 && distancia > 100) {
            System.out.println("Resultado: Se usará Transporte pesado");
        }

        // REGLA B
        else if (peso < 50 && esFragil == true) {
            System.out.println("Resultado: Se usará Envío Premium");
        }

        // REGLA C
        else if (peso < 10 && distancia < 20) {
            System.out.println("Resultado: Se usará Dron");
        }

        // CASO FINAL
        else {
            System.out.println("Resultado: Se usará Envío estándar");
        }

        teclado.close(); // apagar lo del scanner
    }
}