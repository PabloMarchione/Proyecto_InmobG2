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
            //ps.setInt(5, calqui.getInmueble().getId_inmueble());
            ps.setInt(6, calqui.getInquilino().getId_inquilino());
            
            ps.executeUpdate();
            
            //getGeneratedKeys devuelve un result set
            ResultSet rs = ps.getGeneratedKeys();
            
            //si pudo agregar el contrato, el result set tendra un componente, al que le seteamos el id
            if(rs.next())
            {
                // 1 es el numero de columna
                calqui.setIdContrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato creado existosamente");
                //JOptionPane.showMessageDialog(null, "El Propietario con ID: " + calqui.getInmueble().getPropietario().getId_propietario() + " recibió un aviso al teléfono " + calqui.getInmueble().getPropietario().getTelefono());
                
                //debo modificar el estado de la propiedad a no disponible
                
                //Ideal: a traves de un metodo de InmuebleDataMartin, al que le paso el parámetro de idInmueble
                //instancio un InmuebleDataMartin                
                //inmuData.seteaVigente(calqui.getInmueble().getId_inmueble()));
                
                //opción interna:
                /*
                String sql2 = "UPDATE inmueble SET Estado = 1 WHERE idInmueble = ?";
                
                try
                {
                    PreparedStatement ps2 = con.prepareStatement(sql2);
                    
                    ps2.setInt(1, calqui.getInquilino().getId_inquilino()); //INMUEBLE  
                
                    int exito = ps2.executeUpdate();
                
                    //estoy modificando una sola materia, por lo tanto si es correcto, devuelve 1
                    if (exito == 1)
                    {
                        JOptionPane.showMessageDialog(null, "InmuebleMartin vinculado al contrato exitosamente");
                    }
                    // debería agregar ps2.close() ???
                }
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla inmueble");
                }
                
                */
                
            }
            //cierro el objeto para liberar recursos
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
    }
    
}
