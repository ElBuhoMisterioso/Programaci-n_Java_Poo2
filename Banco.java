
import java.util.Scanner;


 public class Banco {
    private String usuario;
    private String contrasena;
    private double salario;

        public Banco(String usuario, String contrasena, double salario) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.salario = salario;
    }

    // 📦 Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese su contrase��a:");
        String contrasena = scanner.nextLine();

        System.out.println("Ingrese su salario:");
        double salario = scanner.nextDouble();

        // se va crear la interfaz del banco, en donde se va a pedir el usuario y la contrase��a
    }
}