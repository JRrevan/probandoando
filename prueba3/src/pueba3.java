
// Importaciones (opcional)
import java.util.Scanner;

// Declaración de la clase
    public class pueba3 {

    // Método main
    public static void main(String[] args) {
        // Cuerpo del método main
        System.out.println("Hola, mundo!");

        // Ejemplo de uso de una clase importada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");
    }
}