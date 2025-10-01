 public class Banco {
    private String usuario;
    private String contrasena;
    private double salario;

        public Banco(String usuario, String contrasena, double salario) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.salario = salario;
    }

    //Getters y Setters
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

    // verificar usuario y contrase��a

    public void verificarCredenciales(String usuario, String contrasena) {
        if (this.usuario.equals(usuario) && this.contrasena.equals(contrasena)) {
            System.out.println("Credenciales correctas.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }
}