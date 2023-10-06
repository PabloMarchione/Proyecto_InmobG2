
package inmobiliaria_mddp.accesoDatos;

import inmobiliaria_mddp.entidades.*;
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


public class InmuebleData {
    
    private Connection con = null;
    
    /*
    public InmuebleData(){
        
        con = ConexP.getConexion();
    }
    */
    public InmuebleData(){
        
        con = Conexion.getConexion();
    }
    
    
    public void estadoInmueble(int id){
        
        try {
            String sql = "UPDATE inmueble SET Estado = 0 WHERE idInmueble = ?";
            PreparedStatement ps = con.prepareStatement(sql);//pide el try por el close, al pedo
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, "El inmueble pasa a estar ocupado. ");
            }
             ps.close();
            } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmuebles");
            }
    }
    
    
    
}
