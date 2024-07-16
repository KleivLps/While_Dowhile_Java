import java.util.Scanner;

public class contarDigitos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int numero;
            int digitos;


                System.out.println("\nDigite un número entero: ");
                numero = scanner.nextInt();
                scanner.nextLine();
                digitos = 0;
                int numeroAbsoluto = Math.abs(numero);

                if (numero == 0 ) {
                    digitos = 1;
                } else {
                    while (numeroAbsoluto != 0) {
                        numeroAbsoluto /= 10;
                        digitos++;
                    }
                }
            System.out.println("\nEl numero " +numero+ " tiene " +digitos+ " digitos.\n");
            }
                }
            }
