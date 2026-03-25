import java.util.Scanner;

public class estructurasrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usamos arreglos paralelos con una capacidad maxima fija
        int capacidadMaxima = 100;
        String[] nombres = new String[capacidadMaxima];
        int[] cantidades = new int[capacidadMaxima];
        double[] precios = new double[capacidadMaxima];

        int contadorProductos = 0;
        int opcion;

        System.out.println("Sistema de Control de Inventario");

        // Ciclo do-while para el ingreso continuo de datos
        do {
            System.out.print("\nIngrese el nombre del producto: ");
            nombres[contadorProductos] = scanner.nextLine();

            int cantidad = -1;
            // Ciclo while para validar la cantidad
            while (cantidad < 0) {
                System.out.print("Ingrese la cantidad (0 o mayor): ");
                cantidad = scanner.nextInt();
            }
            cantidades[contadorProductos] = cantidad;

            double precio = -1.0;
            // Ciclo while para validar el precio
            while (precio < 0.0) {
                System.out.print("Ingrese el precio unitario (0 o mayor): ");
                precio = scanner.nextDouble();
            }
            precios[contadorProductos] = precio;

            // Aumentamos el contador para pasar al siguiente espacio disponible en los arreglos
            contadorProductos++;

            System.out.print("Desea ingresar otro producto? (1 = Si, 0 = No): ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            // El ciclo tambien se detiene si se alcanza el limite de los arreglos por seguridad
        } while (opcion != 0 && contadorProductos < capacidadMaxima);


        // Fase de calculo y resumen
        double valorAcumuladoTotal = 0;
        System.out.println("\nResumen de Inventario");

        // Ciclo for para recorrer los arreglos paralelos usando el contador de productos ingresados
        for (int i = 0; i < contadorProductos; i++) {
            double valorProducto = cantidades[i] * precios[i];
            valorAcumuladoTotal += valorProducto;

            System.out.println("Producto: " + nombres[i] +
                    " | Cantidad: " + cantidades[i] +
                    " | Precio Unitario: $" + precios[i] +
                    " | Valor Total: $" + valorProducto);
        }

        System.out.println("Valor Total Acumulado del Inventario: $" + valorAcumuladoTotal);
        scanner.close();
    }
}