import java.util.Scanner;

public class whileDowhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("""
                        Seleccione una opción del menu:
                        1. Comprar producto
                        2. Realizar devolucion
                        3. Ver mis pedidos
                        4. Preguntas frecuentes
                        5. Salir
                        """);

                System.out.println("Ingrese su opcion: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> System.out.println("Producto añadido \n");
                    case 2 -> System.out.println("Devolución realizada \n");
                    case 3 -> System.out.println("Pedidos: a b c");
                    case 4 -> System.out.println("Lista de productos: x y z \n");
                    case 5 -> System.out.println("Gracias, vuelva prontos \n");
                    default-> System.out.println("Numero erroneo\n");
                }
            } while (opcion != 5);
        }


    }
}