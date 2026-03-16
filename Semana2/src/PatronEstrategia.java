/** 4. El patrón de estrategia
*Tiene un if…else de 10 niveles para calcular descuentos según el tipo de cliente. Investigue
*porque los desarrolladores dicen que “muchos if seguidos son olor de código (code smell)” y
*proponga una alternativa inicial usando un switch mejorado o discutir como los objetos
*podrían reemplazar estas decisiones en el futuro. */

// Se dice esto porque este tipo de estructura es dif

public class PatronEstrategia {
    public static void main(String[] args) {
        String tipoCliente = "VIP";
        double precioBase = 1000.0;

        double descuento = switch (tipoCliente) { //el switch esta permitiendo asignar el resultado directamente a una variable, lo que mejora la legibilidad y reduce la posibilidad de errores.
            case "NUEVO" -> 0.05;
            case "REGULAR" -> 0.10;
            case "ESTUDIANTE" -> 0.15;
            case "VIP" -> 0.20;
            case "PREMIUM" -> 0.30;
            default -> 0.0;
        };

        double precioFinal = precioBase - (precioBase * descuento);
        System.out.println(precioFinal); // da 800.0
    }
}
