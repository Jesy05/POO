/**5. Validador de complejidad de contraseñas
 *n sistema de seguridad debe clasificar contraseñas.
 *Reglas:
 *• Si tiene < 8 caracteres: “Insegura”.
 *• Si tiene >= 8 caracteres y al menos un número: “Moderada”.
 *• Si tiene >= 8, un número y una mayúscula: “Fuerte”*/

public class ValidadorContrasenas {
    public static void main(String[] args) {
        String contrasena = "Seguridad123";

        int longitud = contrasena.length();
        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (int i = 0; i < longitud; i++) {
            char c = contrasena.charAt(i);

            if (c >= '0' && c <= '9') {
                tieneNumero = true;
            }
            if (c >= 'A' && c <= 'Z') {
                tieneMayuscula = true;
            }
        }

        if (longitud < 8) {
            System.out.println("Insegura");
        } else if (tieneNumero && tieneMayuscula) {
            System.out.println("Fuerte");
        } else if (tieneNumero) {
            System.out.println("Moderada");
        } else {
            System.out.println("Insegura");
        }
    }
}