import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] prodNomb = new String[5];
        double[] productPrices = new double[5];
        double totalSum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Escriba el nombre del producto " + (i + 1) + ":");
            prodNomb[i] = scanner.nextLine();
            System.out.println("Ingrese el precio: ");
            productPrices[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            double PrecioFinal = calculateFinalPrice(productPrices[i]);
            System.out.printf(" Producto: " + prodNomb[i] + "." +  " Precio final: " + PrecioFinal);
            totalSum += PrecioFinal;
        }

        System.out.printf(" El total de la compra es: " + totalSum);
    }

    private static double calculateFinalPrice(double precio) {
        double tax = precio * 0.19;
        double discount = (precio > 10000) ? (precio * 0.10) : 0;
        return precio + tax - discount;
    }
}