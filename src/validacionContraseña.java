import java.util.Scanner;

public class validacionContraseña {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            String contraseña;


            do {
                System.out.println("\n Digite la contraseña: ");
                contraseña = scanner.nextLine();
                if (!contraseña.equals("secreto")) {
                    System.out.println("Contraseña incorrecta. Prueba otra vez.");
                }
            } while (!contraseña.equals("secreto"));
            System.out.println("Contraseña correcta! \n");
        }
    }
}
