import java.util.Scanner;
public class RegistroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ----Bienvenido al sistema de registro de usuarios----");

        // información del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, correo, contrasena);

        // Validar la información del usuario
        if (nuevoUsuario.validarNombre() && nuevoUsuario.validarCorreo() && nuevoUsuario.validarContrasena()) {
            System.out.println("Usuario registrado exitosamente.");
        } else {
            System.out.println("Error: Por favor, ingrese información válida.");
        }

        scanner.close();
    }
}