
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
    private PropietarioMartin propietario;

    public InmuebleMartin() {
    }

    public InmuebleMartin(int idInmueble, PropietarioMartin propietario) {
        this.idInmueble = idInmueble;
        this.propietario = propietario;
    }
    
    
    
    
}
