public class MejoraSwitch {
    public static void main(String[] args) {
        // se define una variable de prueba para evaluar el día.
        int dia = 3;

        // uso de el operador de flecha (->) para asignar el resultado de forma directa
        System.out.println(switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";

            // un 'default' obligatorio aquí para asegurar que siempre se devuelva un String
            default -> "Fin de semana u otro día";
        });
    }
}