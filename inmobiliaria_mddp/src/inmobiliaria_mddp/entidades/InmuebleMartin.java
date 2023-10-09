
package inmobiliaria_mddp.entidades;


public class InmuebleMartin {
    
    private int idInmueble;
    private int codigo;
    private String direccion;
    private int altura;
    private String tipo;
    private int superficie;
    private int precio;
    private boolean estado;
    private Propietario propietario;

    public InmuebleMartin() {
    }

    public InmuebleMartin(int idInmueble, Propietario propietario) {
        this.idInmueble = idInmueble;
        this.propietario = propietario;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    
    
    
}
