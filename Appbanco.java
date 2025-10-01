import java.util.Scanner;

public class Appbanco {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese su contrase��a:");
        String contrasena = scanner.nextLine();

        System.out.println("Ingrese su salario:");
        double salario = scanner.nextDouble();

        Banco banco = new Banco(usuario, contrasena, salario);
        System.out.println("Bienvenido " + banco.getUsuario() + ". Su salario es: " + banco.getSalario());
        scanner.close();

        
    }
}
