import java.util.Scanner;

public class contadorParesImpares {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int pares;
            int impares;
            int numero;

            pares = 0;
            impares = 0;
            System.out.println("Ingresa una serie de números enteros (0 para terminar): ");

            do {
                System.out.println("Número: ");
                numero = scanner.nextInt();
                scanner.nextLine();

                if (numero != 0) {
                    if (numero % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                }
            } while (numero !=0);

            System.out.println("Cantidad de pares: " +pares);
            System.out.println("Cantidad de impares: " +impares + "\n");
            }
        }
    }