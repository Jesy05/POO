import java.util.Scanner;

public class estructurasrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uso de arreglos paralelos con una capacidad maxima fija
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

}