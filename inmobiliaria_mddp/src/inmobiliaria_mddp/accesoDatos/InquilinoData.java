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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caja0
 */
public class InquilinoData {
    
    private Connection con;
    
    
//    public InquilinoData(){
//        
//        con = ConexP.getConexion();
//    }
    
    
    
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
           JOptionPane.showMessageDialog(null,"Inquilino Agregado Correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el inquilino");
            }
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino ");
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino ");
        }
        
        return inqui;
    }
    
    
    public void eliminarInquilino(int id_inquilino){
        
        
//              Inquilino b=new Inquilino();
//           buscarInquiActivo(id_inquilino);
//           if (b!=null){
//               JOptionPane.showMessageDialog(null,"holslaldlsdasd");
//        
        String sql="DELETE FROM inquilino WHERE idInquilino=?";
        
        try {
                       
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, id_inquilino);
            int filas=ps.executeUpdate();
            
            
            
            if(filas>0){
                
                JOptionPane.showMessageDialog(null, "se borro inquilino correctamente");
                             
                
            }
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"no se puede borrar inquilino se encuenta asociado a una contrato" );
        }
        
           }
        
        
    
    
    /////////////////////////////// TRAE A TODOS LOS INQUILINOS
    public List<Inquilino> listarInquilinos() {
        
        List<Inquilino> inquilinos = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inquilino ORDER BY NomCom ASC";///CON EL ORDER BY SE PUEDEN ORDENAR PARA MOSTRAR EN LA VISTA MEJORSELECT * FROM propietario ORDER BY apellido ASC
            PreparedStatement ps = con.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inquilino inquilino = new Inquilino();
                inquilino.setId_inquilino(rs.getInt("IdInquilino"));
                inquilino.setNomCom(rs.getString("NomCom"));
                inquilino.setCuitIn(rs.getInt("CuitIn"));
                inquilino.setTelContacto(rs.getInt("TelContacto"));
                inquilino.setLugarDeTra(rs.getString("LugarDeTra"));
                inquilino.setNomCompletoGa(rs.getString("NomCompletoGa"));
                inquilino.setCuitGarante(rs.getInt("CuitGarante"));
                
                inquilinos.add(inquilino);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inquilino ");
        }
        return inquilinos;
    }
     public Inquilino buscarInquilinoConCuit(int cuit)
    {
        Inquilino inqui = null;
        
        String sql = "SELECT idInquilino, NomCom, CuitIn, TelContacto, LugarDeTra, NomCompletoGa, CuitGarante FROM inquilino WHERE CuitIn = ?";
        
        try 
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,cuit );
            
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
               // JOptionPane.showMessageDialog(null, "No se encontro el Inquilino");
            }
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino ");
        }
        
        return inqui;
    }
     
     
     public Inquilino buscarInquiActivo (int id){
         
         String sql="SELECT idInquilino FROM `calquiler` WHERE estado=?";
         Inquilino inq=null;
         try
         {
             PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                inq=new Inquilino();
                System.out.println("ese enconto true");
            }
            
                
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino ");
        }
         return inq;
     }
}

        
            
         
      
     

