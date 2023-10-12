
package inmobiliaria_mddp.entidades;


public class Inmueble {
    
    private int idInmueble;
    private int codigo;
    private String direccion;
    private int altura;
    private String tipo;
    private int superficie;
    private int precio;
    private boolean estado;
    private Propietario propietario;

    public Inmueble() {
    }

    public Inmueble(int codigo, String direccion, int altura, String tipo, int superficie, int precio, boolean estado, Propietario propietario) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.estado = estado;
        this.propietario = propietario;
    }

    public Inmueble(int idInmueble, int codigo, String direccion, int altura, String tipo, int superficie, int precio, boolean estado, Propietario propietario) {
        this.idInmueble = idInmueble;
        this.codigo = codigo;
        this.direccion = direccion;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.estado = estado;
        this.propietario = propietario;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return direccion + " " + altura + ", tipo: " + tipo + ", superficie: " + superficie + ", precio: " + precio;
    }
    
    
    
}
