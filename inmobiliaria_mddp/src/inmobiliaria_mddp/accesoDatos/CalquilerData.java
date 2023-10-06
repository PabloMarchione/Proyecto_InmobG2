/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_mddp.accesoDatos;

import inmobiliaria_mddp.entidades.Calquiler;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class CalquilerData {
    
    private Connection con;
    
    private InquilinoDataMartin inquiData;
    private InmuebleDataMartin inmuData;
    
    //constructor
    public CalquilerData(){
        
        //primera instrucción siempre obtener conexión
        con = Conexion.getConexion();
    }
    
    //métodos públicos
    public void generarContrato(Calquiler calqui)
    {
        //debo insertar una fila en la tabla alquiler
        String sql = "INSERT INTO calquiler (fechaIni, fechaFin, PrecioAlquiler, Estado, idInmueble, idInquilino) VALUES (?, ?, ?, ?, ?, ?)";
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1, Date.valueOf(calqui.getFechaIni()));
            ps.setDate(2, Date.valueOf(calqui.getFechaFin()));
            ps.setInt(3, calqui.getPrecioAlquiler());
            ps.setInt(4, calqui.getEstado());
            ps.setInt(5, calqui.getInmueble().getIdInmueble()); //reemplazar por entidad de Pablo, que a su vez tiene la entidad Propietario de Diana
            ps.setInt(6, calqui.getInquilino().getId_inquilino()); //reemplazar por entidad de Diego 
            
            ps.executeUpdate();
            
            //getGeneratedKeys devuelve un result set
            ResultSet rs = ps.getGeneratedKeys();
            
            //si pudo agregar el contrato, el result set tendra un componente, al que le seteamos el id
            if(rs.next())
            {
                // 1 es el numero de columna
                calqui.setIdContrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato creado existosamente");
                JOptionPane.showMessageDialog(null, "El Propietario con ID: " + calqui.getInmueble().getPropietario().getIdPropietario() + " recibió un aviso al teléfono " + calqui.getInmueble().getPropietario().getTelefono());
                
                //debo modificar el estado de la propiedad a no disponible
                InmuebleData inmuData = new InmuebleData();
                inmuData.estadoInmueble(calqui.getInmueble().getIdInmueble()); //reemplazar por entidad de Pablo
            }
            //cierro el objeto para liberar recursos
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
    }
    
}
