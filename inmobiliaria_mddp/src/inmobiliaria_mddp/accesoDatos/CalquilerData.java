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
import java.util.ArrayList;
import java.util.List;
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
        
        String sql = "SELECT idContrato, fechaIni, fechaFin, PrecioAlquiler, Estado, idInmueble, idInquilino FROM calquiler WHERE idContrato = ?";
        
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
                calqui.setPrecioAlquiler(rs.getInt("PrecioAlquiler"));
                calqui.setEstado(rs.getInt("Estado"));
                //debo traer un inmueble a partir del idInmueble
                InmuebleData inmuData = new InmuebleData();
                calqui.setInmueble(inmuData.buscarInmuebleConID(rs.getInt("idInmueble")));
                //debo traer un inquilino a partir del idInquilino
                InquilinoData inquiData = new InquilinoData();
                calqui.setInquilino(inquiData.buscarInquilinoConID(rs.getInt("idInquilino")));
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
                
                //debo modificar el estado de la propiedad a ocupado, o sea estado = 0
                InmuebleData inmuData = new InmuebleData();
                inmuData.estadoInmuebleOcupado(calqui.getInmueble().getIdInmueble()); 
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
                //seteo inmueble a disponible, o sea estado = 1
                InmuebleData inmuData = new InmuebleData();
                //traer un calquiler con el num de id
                //llamar al metodo buscar contrato Con ID
                Calquiler calqui = new Calquiler();
                CalquilerData calquiData = new CalquilerData();
                calqui = calquiData.buscarContrato(idContrato);
                //modificar estado de inmueble a disponible
                inmuData.estadoInmuebleDisponible(calqui.getInmueble().getIdInmueble()); 
            }
            ps.close();
        } 
         
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
    }
    
    public void renovarContrato(Calquiler calqui)
    {
        CalquilerData calquiData = new CalquilerData();
        
        String sql = "UPDATE calquiler SET fechaIni = ?, fechaFin = ?, PrecioAlquiler = ?, Estado = 2 WHERE idContrato = ?";
        //1 es fechaini, 2 es fechafin, 3 es precioalquiler y 4 es idContrato
        //estado = 2 es renovado. 0 era anulado o inactivo, y 1 era activo o vigente
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setDate(1, Date.valueOf(calqui.getFechaIni()));
            ps.setDate(2, Date.valueOf(calqui.getFechaFin()));
            ps.setInt(3, calqui.getPrecioAlquiler());
            
            ps.setInt(4, calqui.getIdContrato());
            
            int fila=ps.executeUpdate();
            
            if (fila == 1)
            {
                JOptionPane.showMessageDialog(null, "El contrato de alquiler se ha renovado.");
            }
            //cierro el objeto para liberar recursos
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
    }
    
    public List<Calquiler> listarVigentes()
    {
        String sql = "SELECT idContrato, fechaIni, fechaFin, PrecioAlquiler, Estado, idInmueble, idInquilino FROM calquiler WHERE Estado != 0";
        
        //declaro atributo que recibirá parametros del result set
        List<Calquiler> calquis = new ArrayList<>();
        
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            
            //executeQuery devuleve un result set
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                //voy construyendo contratos y agrego a la lista
                Calquiler calqui = new Calquiler();
                calqui.setIdContrato(rs.getInt("idContrato"));
                calqui.setFechaIni(rs.getDate("fechaIni").toLocalDate()); 
                calqui.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                calqui.setPrecioAlquiler(rs.getInt("PrecioAlquiler"));
                calqui.setEstado(rs.getInt("Estado"));
                //debo traer un inmueble a partir del idInmueble
                InmuebleData inmuData = new InmuebleData();
                calqui.setInmueble(inmuData.buscarInmuebleConID(rs.getInt("idInmueble")));
                //debo traer un inquilino a partir del idInquilino
                InquilinoData inquiData = new InquilinoData();
                calqui.setInquilino(inquiData.buscarInquilinoConID(rs.getInt("idInquilino")));
                
                //agrego contrato a la lista
                calquis.add(calqui);
            }
            //cierro el objeto para liberar recursos
            ps.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
        return calquis;
    }
    
    public List<Calquiler> historialPorInmueble(int idInmueble)
    {
        String sql = "SELECT idContrato, fechaIni, fechaFin, PrecioAlquiler, Estado, idInmueble, idInquilino FROM calquiler WHERE idInmueble = ? ";
        
        //declaro atributo que recibirá parametros del result set
        List<Calquiler> calquis = new ArrayList<>();
        
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            
            //asigno valor a ? placeholder que me pasan por parámetro
            ps.setInt(1, idInmueble);
            
            //executeQuery devuleve un result set, compuesto por UN solo contrato, o VACIO si no existe ese id
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                //voy construyendo contratos y agrego a la lista
                Calquiler calqui = new Calquiler();
                calqui.setIdContrato(rs.getInt("idContrato"));
                calqui.setFechaIni(rs.getDate("fechaIni").toLocalDate()); 
                calqui.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                calqui.setPrecioAlquiler(rs.getInt("PrecioAlquiler"));
                calqui.setEstado(rs.getInt("Estado"));
                //debo traer un inmueble a partir del idInmueble
                InmuebleData inmuData = new InmuebleData();
                calqui.setInmueble(inmuData.buscarInmuebleConID(rs.getInt("idInmueble")));
                //debo traer un inquilino a partir del idInquilino
                InquilinoData inquiData = new InquilinoData();
                calqui.setInquilino(inquiData.buscarInquilinoConID(rs.getInt("idInquilino")));
                
                //agrego contrato a la lista
                calquis.add(calqui);
            }

            //cierro el objeto para liberar recursos
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla calquiler. " + ex.getMessage() );
        }
        return calquis;
    }
}
