import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Cual es tu nombre: ");
        Int nombre = dato.nextLine();
        
        System.out.println("Cual es tu apellido: ");
        String apellido = dato.nextLine();
        
        System.out.println("Cual es tu correo: ");
        String correo = dato.nextLine();
        
        System.out.println("Cual es tu numero de telefono: ");
        String telefono = dato.nextLine();
        
        System.out.println("Cual es tu direccion: ");
        String direccion = dato.nextLine();
        
        System.out.println(" Resumen");
        System.out.println("Tu nombre completo es: " + nombre + apellido );
        System.out.println("Tu correo es: " + correo);
        System.out.println("Tu numero de telefono es: " + telefono);
        System.out.println("Tu direccion es: " + direccion);
        
        
    }   
}
