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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class CalquilerData {
    
    private Connection con;
    
    private InquilinoDataMartin inquiData;
    private InmuebleData inmuData;
    
    //constructor
    public CalquilerData(){
        
        //primera instrucción siempre obtener conexión
        con = Conexion.getConexion();
    }
    
    //métodos públicos
    
    public Calquiler buscarContrato(int id)
    {
        Calquiler calqui = null;
        
        String sql = "SELECT idContrato, fechaIni, fechaFin, PrecioAlquiler, Estado, idInmueble, idInquilino WHERE idContrato = ?";
        
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                calqui = new Calquiler();
                calqui.setIdContrato(rs.getInt("idContrato"));
                calqui.setFechaIni(rs.getDate("fechaIni").toLocalDate());
                calqui.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                calqui.setEstado(rs.getInt("Estado"));
                //debo traer un inmueble a partir del idInmueble
                InmuebleData inmuData = new InmuebleData();
                calqui.setInmueble(inmuData.buscarInmuebleConID(rs.getInt("idInmueble")));
                //debo traer un inquilino a partir del idInquilino
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
        
        return calqui;
    }
    
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
                inmuData.estadoInmuebleDisponible(calqui.getInmueble().getIdInmueble()); 
            }
            //cierro el objeto para liberar recursos
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
    }
    
    public void anularContrato(int idContrato)
    {
        //modifico fila de tabla calquiler
        String sql = "UPDATE calquiler SET Estado = 0 WHERE idContrato = ?";
        
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idContrato);
            
            int fila=ps.executeUpdate();
            
            if(fila==1)
            {
                JOptionPane.showMessageDialog(null, "El contrato de alquiler se ha anulado.");
                //seteo inmueble a disponible
                InmuebleData inmuData = new InmuebleData();
                inmuData.estadoInmuebleOcupado(calqui.getInmueble().getIdInmueble()); 
            }
            ps.close();
        } 
         
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
    }
    
}
