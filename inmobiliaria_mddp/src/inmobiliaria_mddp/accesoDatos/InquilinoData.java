/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_mddp.accesoDatos;

import inmobiliaria_mddp.entidades.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caja0
 */
public class InquilinoData {
    
    private Connection con;
    
    public InquilinoData()
    {
        con = Conexion.getConexion();
    }
    
    public void guardarInquilino(Inquilino inquilino)
    {
//        Inquilino inqui = null;
        
        String sql = "INSERT INTO inquilino(NomCom, CuitIn,TelContacto, LugarDeTra, NomCompletoGa, CuitGarante) VALUES (?,?,?,?,?,?)";
        
        try 
        {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          ps.setString(1,inquilino.getNomCom());
          ps.setInt(2,inquilino.getCuitIn());
          ps.setInt(3,inquilino.getTelContacto());
          ps.setString(4,inquilino.getLugarDeTra());
          ps.setString(5,inquilino.getNomCompletoGa());
          ps.setInt(6,inquilino.getCuitGarante());
          
           ps.executeUpdate();
           
             ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next())
            {
           
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el inquilino");
            }
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        
     
    }
    public void modificarInquilino (Inquilino inquilino){
        
        
        String sql ="UPDATE inquilino SET NomCom=?,CuitIn=?,TelContacto=?, LugarDeTra=?,NomCompletoGa=?,CuitGarante=? WHERE  idInquilino=?";
   
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,inquilino.getNomCom());
            ps.setInt(2,inquilino.getCuitIn());
            ps.setInt(3,inquilino.getTelContacto());
            ps.setString(4,inquilino.getLugarDeTra());
            ps.setString(5,inquilino.getNomCompletoGa());
            ps.setInt(6,inquilino.getCuitGarante());
            ps.setInt(7,inquilino.getId_inquilino());
            
               int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null,"modifico con exito");
                
                
            }  
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "error al aceder a tabla inquilino"+ex);
        }
    
    
    
    }
    
    
    //Buscar por id del inquilino
    public Inquilino buscarInquilinoConID(int id)
    {
        Inquilino inqui = null;
        
        String sql = "SELECT idInquilino, NomCom, CuitIn, TelContacto, LugarDeTra, NomCompletoGa, CuitGarante FROM inquilino WHERE idInquilino = ?";
        
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                inqui = new Inquilino();
                inqui.setId_inquilino(rs.getInt("idInquilino"));
                inqui.setNomCom(rs.getString("NomCom"));
                inqui.setCuitIn(rs.getInt("CuitIn"));
                inqui.setTelContacto(rs.getInt("TelContacto"));
                inqui.setLugarDeTra(rs.getString("LugarDeTra"));
                inqui.setNomCompletoGa(rs.getString("NomCompletoGa"));
                inqui.setCuitGarante(rs.getInt("CuitGarante"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el inquilino");
            }
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        
        return inqui;
    }
    
    
    public void eliminarInquilino(int id_inquilino){
        
        
        String sql="DELETE FROM `inquilino` WHERE id_inquilino=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, id_inquilino);
            int filas=ps.executeUpdate();
            if(filas>0){
                
                JOptionPane.showMessageDialog(null, "se borro inquilino correctamente"+ filas);
                              
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al borrar" +ex);
        }
        
        
        
        
    }
}
