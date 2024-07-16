import java.util.Random;
import java.util.Scanner;

public class adivinaJava {
    public static void main(String[] args) {
        Random random = new Random();
        int num_random = random.nextInt(20) + 1;
        try (Scanner scanner = new Scanner(System.in)) {
            int intento;
            System.out.println("¡ Adivina el numero ! es entre el 1 y el 20");
            do {
                System.out.println("Ingresa tu adivinanza: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, Digita un numero valido. ");
                    scanner.next();
                    System.out.println("Ingrese el numero: ");
                }
                intento = scanner.nextInt();
                String mensajes =(intento < num_random) ? "El numero es mayor que " +intento : (intento > num_random) ? "El número es menor que " + intento : "Acertaste. ";
                System.out.println(mensajes);
            } while (intento != num_random);
        }
    }
}
