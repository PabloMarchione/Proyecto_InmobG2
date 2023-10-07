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
    
}
