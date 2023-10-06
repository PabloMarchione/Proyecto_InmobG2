/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_mddp.entidades;

/**
 *
 * @author marti
 */
public class PropietarioMartin {
    
    private int id_propietario;
    
    private int telefono;

    public PropietarioMartin(int id_propietario, int telefono) {
        this.id_propietario = id_propietario;
        this.telefono = telefono;
    }
    
    
    
    public int getId_propietario() {
        return id_propietario;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
}
