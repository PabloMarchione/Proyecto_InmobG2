
package inmobiliaria_mddp.entidades;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Inquilino {
    private int id_inquilino;
    private String NomCom;
    private int cuitIn;
    private int telContacto;
    private String LugarDeTra;
    private String NomCompletoGa;
    private int CuitGarante;
    private ArrayList<Inmueble> propiedades;

    public Inquilino() {
    }

    public Inquilino(String NomCom, int cuitIn, int telContacto, String LugarDeTra, String NomCompletoGa, int CuitGarante, ArrayList<Inmueble> propiedades) {
        this.NomCom = NomCom;
        this.cuitIn = cuitIn;
        this.telContacto = telContacto;
        this.LugarDeTra = LugarDeTra;
        this.NomCompletoGa = NomCompletoGa;
        this.CuitGarante = CuitGarante;
        this.propiedades = propiedades;
    }
    
    

    public Inquilino(int id_inquilino, String NomCom, int cuitIn, int telContacto, String LugarDeTra, String NomCompletoGa, int CuitGarante, ArrayList<Inmueble> propiedades) {
        this.id_inquilino = id_inquilino;
        this.NomCom = NomCom;
        this.cuitIn = cuitIn;
        this.telContacto = telContacto;
        this.LugarDeTra = LugarDeTra;
        this.NomCompletoGa = NomCompletoGa;
        this.CuitGarante = CuitGarante;
        this.propiedades = propiedades;
            }
    
    

    public int getId_inquilino() {
        return id_inquilino;
    }

    public void setId_inquilino(int id_inquilino) {
        this.id_inquilino = id_inquilino;
    }

    public String getNomCom() {
        return NomCom;
    }

    public void setNomCom(String NomCom) {
        this.NomCom = NomCom;
    }

    public int getCuitIn() {
        return cuitIn;
    }

    public void setCuitIn(int cuitIn) {
        this.cuitIn = cuitIn;
    }

    public int getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(int telContacto) {
        this.telContacto = telContacto;
    }

    public String getLugarDeTra() {
        return LugarDeTra;
    }

    public void setLugarDeTra(String LugarDeTra) {
        this.LugarDeTra = LugarDeTra;
    }

    public String getNomCompletoGa() {
        return NomCompletoGa;
    }

    public void setNomCompletoGa(String NomCompletoGa) {
        this.NomCompletoGa = NomCompletoGa;
    }

    public int getCuitGarante() {
        return CuitGarante;
    }

    public void setCuitGarante(int CuitGarante) {
        this.CuitGarante = CuitGarante;
    }

    public ArrayList<Inmueble> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Inmueble> propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "id_inquilino=" + id_inquilino + ", NomCom=" + NomCom + ", cuitIn=" + cuitIn + ", telContacto=" + telContacto + ", LugarDeTra=" + LugarDeTra + ", NomCompletoGa=" + NomCompletoGa + ", CuitGarante=" + CuitGarante + ", propiedades=" + propiedades + '}';
    }
    
    
    
    
    
}
