
package inmobiliaria_mddp.accesoDatos;

import inmobiliaria_mddp.entidades.Propietario;
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



public class PropietarioData {
    
    private Connection con= null;
     
     
//    public PropietarioData(){
//        
//        con = ConexP.getConexion();
//    }
    
    
    public PropietarioData(){

        con=Conexion.getConexion();
    }
    
    
    
    public void agregarPropietario(Propietario propietario){

        String sql= "INSERT INTO propietario (Cuit, Apellido, Nombre, Domicilio, Telefono, Mail)"
                 + "VALUES (?, ?, ?, ?, ?, ?)";

            try {
                PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                ps.setInt(1, propietario.getCuit());
                ps.setString(2, propietario.getApellido());
                ps.setString(3, propietario.getNombre());
                ps.setString(4, propietario.getDomicilio());
                ps.setInt(5, propietario.getTelefono());
                ps.setString(6, propietario.getMail());

                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();

                if(rs.next())
                {
                    propietario.setIdPropietario(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Propietario agregado con éxito");

                }

                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla propietario");
            }
        }   

    public Propietario buscarPropietarioPorID(int id){

        String sql= "SELECT cuit, apellido, nombre, domicilio, telefono, mail FROM propietario WHERE idPropietario=?";

        Propietario pro=null;

            try {
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setInt(1, id);

                ResultSet rs=ps.executeQuery();

                if(rs.next()){
                    pro=new Propietario();
                    pro.setIdPropietario(id);
                    pro.setCuit(rs.getInt("cuit"));
                    pro.setApellido(rs.getString("apellido"));
                    pro.setNombre(rs.getString("nombre"));
                    pro.setDomicilio(rs.getString("domicilio"));
                    pro.setTelefono(rs.getInt("telefono"));
                    pro.setMail(rs.getString("mail"));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se encontró propietario con id:" + id);
                }
                ps.close();


            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla propietario");  
            }
            return pro;
    }

    public void modificarPropietario(Propietario propietario){

        String sql= "UPDATE propietario SET cuit=?, apellido=?, nombre=?, domicilio=?, telefono=?, mail=? WHERE idPropietario=?";

            try {
                PreparedStatement ps=con.prepareStatement(sql);

                ps.setInt(1, propietario.getCuit());
                ps.setString(2, propietario.getApellido());
                ps.setString(3, propietario.getNombre());
                ps.setString(4, propietario.getDomicilio());
                ps.setInt(5, propietario.getTelefono());
                ps.setString(6, propietario.getMail());
                ps.setInt(7, propietario.getIdPropietario());

                int exito=ps.executeUpdate();
                 if(exito==1)
                 {
                JOptionPane.showMessageDialog(null, "Propietario modificado con éxito");
                 }

            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla propietario");  
            }

    }
    
    public List<Propietario> ListarPropietarios(){

        String sql= "SELECT * FROM propietario WHERE 1";

        List<Propietario>propietario= new ArrayList<>();

            try {
                PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();

                while(rs.next())
                {
                    Propietario pro= new Propietario();
                    pro.setIdPropietario(rs.getInt("idPropietario"));
                    pro.setCuit(rs.getInt("cuit"));
                    pro.setApellido(rs.getString("apellido"));
                    pro.setNombre(rs.getString("nombre"));
                    pro.setDomicilio(rs.getString("domicilio"));
                    pro.setTelefono(rs.getInt("telefono"));
                    pro.setMail(rs.getString("mail"));
                    propietario.add(pro);
                }

                ps.close();

            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla propietario");   
            }

             return propietario;
    
    }
}

    



    
    

