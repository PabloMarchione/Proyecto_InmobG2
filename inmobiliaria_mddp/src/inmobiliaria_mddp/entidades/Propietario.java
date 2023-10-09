
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

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Propietario{" + "idPropietario=" + idPropietario + ", cuit=" + cuit + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", mail=" + mail + '}';
        
    }
    
}
    
    
    
    

