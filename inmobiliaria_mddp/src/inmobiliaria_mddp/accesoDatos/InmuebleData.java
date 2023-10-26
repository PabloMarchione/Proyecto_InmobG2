
package inmobiliaria_mddp.accesoDatos;

import inmobiliaria_mddp.entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InmuebleData {
    
    private Connection con = null;
    
    
//    public InmuebleData(){
//        
//        con = ConexP.getConexion();
//    }
    
    public InmuebleData(){
        
        con = Conexion.getConexion();
    }
    
    //Agregado por Martin
    //Ocupado es lo mismo que Estado = 0
    public void estadoInmuebleOcupado(int id){
        
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
    
    //Agregado por Martin
    //disponible es lo mismo que Estado = 1 
    public void estadoInmuebleDesocupado(int id){
        
        try {
            String sql = "UPDATE inmueble SET Estado = 1 WHERE idInmueble = ?";
            PreparedStatement ps = con.prepareStatement(sql);//pide el try por el close, al pedo
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            if(fila==1){
                JOptionPane.showMessageDialog(null, "El inmueble pasa a estar disponible. ");
            }
             ps.close();
            } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmuebles");
            }
    }
    
    
    /////////////////////////////// INSERTAR INMUEBLE NUEVO ---OK
    public void guardarInmueble(Inmueble inmueble) {
        
        String sql = "INSERT INTO inmueble (codigo, direccion, altura, tipo, superficie, precio, estado, idPropietario) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,inmueble.getCodigo());
            ps.setString(2,inmueble.getDireccion());
            ps.setInt(3,inmueble.getAltura());
            ps.setString(4,inmueble.getTipo());
            ps.setInt(5,inmueble.getSuperficie());
            ps.setInt(6,inmueble.getPrecio());
            ps.setBoolean(7,inmueble.isEstado());
            ps.setInt(8,inmueble.getPropietario().getIdPropietario());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inmueble.setIdInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Nuevo inmueble añadido correctamente.");
            }
            ps.close();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble, codigo duplicado.");
        }
    }
    
    
    /////////////////////////////// BUSCAR POR ID DEL INMUEBLE ---OK
    public Inmueble buscarInmuebleConID(int id) {
        Inmueble inmueble = null;
        String sql = "SELECT idInmueble, codigo, direccion, altura, tipo, superficie, precio, estado, idPropietario "
                + "FROM inmueble WHERE idInmueble = ?";
        PreparedStatement ps = null;//pide el try por el close, al pedo
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idpropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
                
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el inmueble");
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmueble;
    }
    
    
    /////////////////////////////// BUSCAR POR ID DEL PROPIETARIO, TRAE EL PRIMERO QUE ENCUENTRA SI HAY VARIOS ---OK
    public Inmueble buscarInmueblePorPropietario(int id) {
        Inmueble inmueble = null;
        String sql = "SELECT idInmueble, codigo, direccion, altura, tipo, superficie, precio, estado, idPropietario "
                + "FROM inmueble WHERE idPropietario = ?";
        PreparedStatement ps = null;//pide el try por el close, al pedo
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idPropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el inmueble");
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmueble;
    }
    
    
    /////////////////////////////// TRAE A TODOS LOS INMUEBLES DE ESE PROPIETARIO ---OK
    public List<Inmueble> listarInmueblesPorPropietario(int id) {
        
        List<Inmueble> inmuebles = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inmueble WHERE idPropietario = ?";///CON EL ORDER BY SE PUEDEN ORDENAR PARA MOSTRAR EN LA VISTA MEJOR
            PreparedStatement ps = con.prepareStatement(sql); //pide el try por el close, al pedo
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                /*
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idpropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
                */
                inmuebles.add(inmueble);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmuebles;
    }
    
    
    /////////////////////////////// TRAE A TODOS! LOS INMUEBLES ---OK
    public List<Inmueble> listarInmuebles() {
        
        List<Inmueble> inmuebles = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inmueble";///CON EL ORDER BY SE PUEDEN ORDENAR PARA MOSTRAR EN LA VISTA MEJOR
            PreparedStatement ps = con.prepareStatement(sql); //pide el try por el close, al pedo
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idpropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
                inmuebles.add(inmueble);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmuebles;
    }
    
    
    /////////////////////////////// MODIFICAR INMUEBLE ---OK
    public void modificarInmueble (Inmueble inmueble){
        
        String sql ="UPDATE inmueble SET "
                + "codigo=?, direccion=?, altura=?, tipo=?, superficie=?, precio=?, estado=?, idPropietario=? "
                + "WHERE  idInmueble=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,inmueble.getCodigo());
            ps.setString(2,inmueble.getDireccion());
            ps.setInt(3,inmueble.getAltura());
            ps.setString(4,inmueble.getTipo());
            ps.setInt(5,inmueble.getSuperficie());
            ps.setInt(6,inmueble.getPrecio());
            ps.setBoolean(7,inmueble.isEstado());
            ps.setInt(8,inmueble.getPropietario().getIdPropietario());
            ps.setInt(9,inmueble.getIdInmueble());
            
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Se modifico el Inmueble "+inmueble.getIdInmueble());
                }  
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble"+ex);
            }
    }
    
    
    /////////////////////////////// BORRAR INMUEBLE DE LA BBDD ---OK
    public void deleteInmueble(int id) {

    try {
        String sql = "DELETE from inmueble WHERE idInmueble = ? ";
        PreparedStatement ps = con.prepareStatement(sql);//pide el try por el close, al pedo
        ps.setInt(1, id);
        int fila=ps.executeUpdate();
        if(fila==1){
            JOptionPane.showMessageDialog(null, " SE ELIMINO EL INMUEBLE! ");
        }
         ps.close();
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, " Error, el inmueble aparece en un contrato");
        }
    }
    
    
    /////////////////////////////// BUSCAR POR CODIGO DEL INMUEBLE ---OK
    public Inmueble buscarInmuebleConCodigo(int c) {
        Inmueble inmueble = null;
        String sql = "SELECT idInmueble, codigo, direccion, altura, tipo, superficie, precio, estado, idPropietario "
                + "FROM inmueble WHERE codigo = ?";
        PreparedStatement ps = null;//pide el try por el close, al pedo
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,c );
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idpropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
                
            }else {
                JOptionPane.showMessageDialog(null, "No se encontro el inmueble");
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmueble;
    }
    
    
    /////////////////////////////// TRAE A TODOS! LOS INMUEBLES DESOCUPADOS ESTADO TRUE-1 ---OK
    public List<Inmueble> listarInmueblesDescopudados() {
        
        List<Inmueble> inmuebles = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inmueble WHERE estado =1 ";///CON EL ORDER BY SE PUEDEN ORDENAR PARA MOSTRAR EN LA VISTA MEJOR
            PreparedStatement ps = con.prepareStatement(sql); //pide el try por el close, al pedo
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idpropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
                inmuebles.add(inmueble);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmuebles;
    }
    
    
    /////////////////////////////// TRAE A TODOS! LOS INMUEBLES DESOCUPADOS ESTADO TRUE-1 ORDENADOS POR CODIGO ---OK
    public List<Inmueble> listarInmueblesDescopudadosOrdenCodigo() {
        
        List<Inmueble> inmuebles = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inmueble WHERE estado =1 ORDER BY codigo";///CON EL ORDER BY SE PUEDEN ORDENAR PARA MOSTRAR EN LA VISTA MEJOR
            PreparedStatement ps = con.prepareStatement(sql); //pide el try por el close, al pedo
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idpropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
                inmuebles.add(inmueble);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmuebles;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    /////////////////////////////// TRAE A TODOS! LOS INMUEBLES DESOCUPADOS Y SU DUEÑO ----DEPRECADO
    public List<Inmueble> listarInmueblesDescopudadosYpropietario() {
    List<Inmueble> inmuebles = new ArrayList<>();
        try{
            String sql ="SELECT inmueble.Codigo, inmueble.Direccion, propietario.Apellido, propietario.Nombre, propietario.Cuit "
                    + "FROM inmueble INNER JOIN propietario ON "
                    + "inmueble.idPropietario = propietario.idPropietario "
                    + "WHERE Estado=1 ORDER BY inmueble.Codigo";
            PreparedStatement ps = con.prepareStatement(sql); //pide el try por el close, al pedo
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setCodigo(rs.getInt("codigo"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAltura(rs.getInt("altura"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecio(rs.getInt("precio"));
                inmueble.setEstado(rs.getBoolean("estado"));
                
                PropietarioData pd = new PropietarioData();
                int idp = rs.getInt("idpropietario");
                Propietario p = pd.buscarPropietarioPorID(idp);
                inmueble.setPropietario(p);
                inmuebles.add(inmueble);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmueble "+ex.getMessage());
        }
        return inmuebles;
    }
    */
    
    
    
    
    
    
    
    /////////////////////////////// NO ELIMINA, CAMBIA EL ESTADO A 0 EN DISPONIBLE ---DEPRECADO
    /*public void eliminarInmueble(int id) {

    try {
        String sql = "UPDATE inmueble SET disponible = 0 WHERE idInmueble = ? ";
        PreparedStatement ps = con.prepareStatement(sql);//pide el try por el close, al pedo
        ps.setInt(1, id);
        int fila=ps.executeUpdate();

        if(fila==1){
            JOptionPane.showMessageDialog(null, " El inmueble paso a NO disponible.");
        }
         ps.close();
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inmueble");
        }
    }
    */
    
    
    
    ///PARA CAMBIAR ESTADO A 0 CUANDO SE CREA UN CONTRATO ----DEPRECADO
    /*public void estadoInmueble(int id){
        
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
    */
    
    
}
