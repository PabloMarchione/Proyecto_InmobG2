
package inmobiliaria_mddp.entidades;


public class Propietario {
    private int idPropietario;
    private int cuit;
    private String apellido;
    private String nombre;
    private String domicilio;
    private int telefono;
    private String mail;

    public Propietario() {
    }

    public Propietario(int cuit, String apellido, String nombre, String domicilio, int telefono, String mail) {
        this.cuit = cuit;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Propietario(int idPropietario, int cuit, String apellido, String nombre, String domicilio, int telefono, String mail) {
        this.idPropietario = idPropietario;
        this.cuit = cuit;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Propietario{" + "idPropietario=" + idPropietario + ", cuit=" + cuit + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", mail=" + mail + '}';
    }
    
    
    
}
