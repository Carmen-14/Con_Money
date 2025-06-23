import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMonedas conversor = new ConversorMonedas();

        System.out.println("=== Conversor de Monedas ===");
        System.out.print("Ingrese la moneda origen (USD, EUR, CLP, JPY): ");
        String deMoneda = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese la moneda destino (USD, EUR, CLP, JPY): ");
        String aMoneda = scanner.nextLine().toUpperCase();

        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();

        try {
            double resultado = conversor.convertir(cantidad, deMoneda, aMoneda);
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", cantidad, deMoneda, resultado, aMoneda);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
