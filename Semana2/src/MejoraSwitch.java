public class MejoraSwitch {
    public static void main(String[] args) {
        int dia = 3;

        System.out.println(switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            default -> "Fin de semana u otro día";
        });
    }
}