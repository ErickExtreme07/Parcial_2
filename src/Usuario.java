import java.util.regex.*;

class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Métodos para validar la información del usuario
    public boolean validarNombre() {
        // El nombre debe contener solo letras y espacios, y tener al menos un caracter
        return nombre.matches("[a-zA-Z ]+") && nombre.length() > 0;
    }

    public boolean validarCorreo() {
        // Expresión regular para validar un correo electrónico básico
        String regexCorreo = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return correo.matches(regexCorreo);
    }

    public boolean validarContrasena() {
        // La contraseña debe tener al menos 8 caracteres, incluyendo al menos una letra mayúscula, una minúscula, y un número
        return contrasena.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}