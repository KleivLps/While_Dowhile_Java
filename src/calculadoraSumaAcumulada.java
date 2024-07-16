import java.util.Scanner;

public class calculadoraSumaAcumulada {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            int numero;
            int pares;
            int impares;
            int suma;
            char continuar;

            suma = 0;
            do {
                System.out.println("Ingresa un número entero positivo para sumar (0 para terminar): ");
                numero = scanner.nextInt();
                scanner.nextLine();

                if (numero >0) {
                    suma += numero;
                    System.out.println("¿Deseas ingresar otro numero? (S/N): ");
                    continuar = scanner.nextLine().charAt(0);
                } else {
                    continuar ='n';
                }
            } while (continuar == 's' || continuar == 'S');
            System.out.println("La suma es: " +suma+ "\n");
}

        }
    }