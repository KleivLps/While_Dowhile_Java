import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            int numero;
            int pares;
            int impares;
            int suma;
            char continuar;

            do {
                System.out.println("Ingrese un número entero para la tabla de multiplicar (0 para salir): ");
                numero = scanner.nextInt();
                scanner.nextLine();

                if (numero != 0) {
                    System.out.println("*****************************");
                    System.out.println("Tabla de multiplicar de " +numero + ": ");
                    for (int i= 1; i<= 10; i++) {
                        System.out.println(numero + " x " +i+ " = " +(numero *i));
                    }
                    System.out.println("********************************\n");
                }
            } while (numero !=0);

        }
    }
}
