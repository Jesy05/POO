/** 2. Validador de fechas
Sin usar la clase LocalDate, determinar si una fecha (día, mes, año) proporcionada por el
usuario es válida. Se deben manejar meses de 30/31 días y la excepción de febrero en años
bisiestos. */

public class ValidadorFechas {
    public static void main(String[] args) {

        //aca las entradas para cambiar y evualar la fecha
        int dia = 3;
        int mes = 2;
        int anio = 2024;

        boolean esValida = false;

        if (anio > 0 && mes >= 1 && mes <= 12 && dia > 0) {
            int diasEnMes = 31;

            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasEnMes = 30;
            } else if (mes == 2) {
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasEnMes = 29;
                } else {
                    diasEnMes = 28;
                }
            }

            if (dia <= diasEnMes) {
                esValida = true;
            }
        }

        if (esValida) {
            System.out.println("Valida");
        } else {
            System.out.println("No valida");
        }
    }
}