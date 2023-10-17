
package ejercicio_contraseña;

import java.util.Scanner;


public class Ejercicio_Contraseña {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese la contraseña: ");
            String contrasena = scanner.nextLine();

            validarContrasena(contrasena);

            System.out.println("Ingrese la contraseña nuevamente para confirmar: ");
            String confirmacion = scanner.nextLine();

            if (!contrasena.equals(confirmacion)) {
                throw new Exception("Las contraseñas no coinciden.");
            }

            System.out.println("Contraseña válida y confirmada con éxito.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validarContrasena(String contrasena) throws Exception {
        if (contrasena.length() < 8) {
            throw new Exception("La contraseña debe tener al menos 8 caracteres.");
        }

        if (contrasena.contains(" ")) {
            throw new Exception("La contraseña no debe contener espacios en blanco.");
        }

        // Verificar si contiene al menos un carácter, un carácter en mayúscula, un número y un carácter especial
        if (!contrasena.matches(".*[a-zA-Z].*") || !contrasena.matches(".*[A-Z].*") ||
                !contrasena.matches(".*\\d.*") || !contrasena.matches(".*[!@#$%^&*()-_=+\\[\\]{};:'\",.<>/?].*")) {
            throw new Exception("La contraseña debe contener al menos un carácter, una mayúscula, un número y un carácter especial.");
        }
    }
    
}
