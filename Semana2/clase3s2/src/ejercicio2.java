import java.sql.SQLOutput;
import java.util.Scanner;
    public class ejercicio2 {
        public static void main(String[]args)
        {
            Scanner scanner = new
                    Scanner(System.in);
            System.out.println("Ingrese un numero entero: ");
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.println("*");
                }

            }

        }

    }