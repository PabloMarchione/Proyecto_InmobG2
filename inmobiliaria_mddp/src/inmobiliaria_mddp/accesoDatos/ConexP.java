
package inmobiliaria_mddp.accesoDatos;

import java.sql.*;

import javax.swing.*;

public class ConexP {
    
    private static final String URL = "jdbc:mariadb://localhost:3307/";
    private static final String DB = "inmobiliariamddp";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;
    
    private ConexP(){};
    
    
    public static Connection getConexion(){
        
        if(connection==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
                //JOptionPane.showMessageDialog(null,"aaaaaaaaaa");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al conectar la BD "+ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar los drivers "+ex.getMessage());
            }
        }
        return connection;
    }
    
}