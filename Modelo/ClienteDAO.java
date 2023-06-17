/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
//import Modelo.Cliente;

/**
 *
 * @author BARBARA
 */
public class ClienteDAO {
    
    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarCliente(Cliente cl){
        String sql="INSERT INTO tabla_cliente(id_cliente,nombre_cliente,telefono,ubicacion_cliente,descripcion_cliente)VALUES(?,?,?,?,? )";
        try{
            con=cn.getConnection();
            ps= con.prepareStatement(sql);
            
            ps.setInt(1,cl.getId_cliente());
            ps.setString(2, cl.getNombre_cliente());
            ps.setInt(3, cl.getTelefono());
            ps.setString(4,cl.getUbicacion_cliente());
            ps.setString(5,cl.getDescripcion_cliente());
            ps.execute();
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
           
        }finally{
            try{
                con.close();
            }catch (SQLException e){
                System.out.println(e.toString());
        }
        }     
        }
    
        
        
    public List ListarCliente(){
        List<Cliente> ListaCl = new ArrayList();
        String sql="SELECT*FROM tabla_cliente";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Cliente cl=new Cliente();
                cl.setId_cliente(rs.getInt("id_cliente"));
                cl.setNombre_cliente(rs.getString("nombre_cliente"));
                cl.setTelefono(rs.getInt("telefono"));
                cl.setDescripcion_cliente(rs.getString("descripcion_cliente"));
                cl.setUbicacion_cliente(rs.getString("ubicacion_cliente"));
                ListaCl.add(cl);
                
            }
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        return ListaCl;
    }
    
    public boolean EliminarCliente(int id_cliente){
        String sql="DELETE FROM tabla_cliente WHERE id_cliente=? ";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, id_cliente);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.print(e.toString());
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException ex){
                System.out.println(ex.toString());
            }
            
        }
            
    }
    
    
    
    
    public boolean ModificarCliente(Cliente cl){
        String sql="UPDATE tabla_cliente SET nombre_cliente=?,telefono=?,ubicacion_cliente=?,descripcion_cliente=? WHERE id_cliente=?";
        try {
            ps =con. prepareStatement(sql);
            
            ps.setString(1,cl.getNombre_cliente());
            ps.setInt(2, cl.getTelefono());
            ps.setString(4,cl.getDescripcion_cliente());
            ps.setString(3,cl.getUbicacion_cliente());
            ps.setInt(5, cl.getId_cliente());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    
    /*public Cliente BuscarCli(int id_cliente){
        Cliente cliente=new Cliente ();
        String sql="SELECT *FROM registro cliente WHERE id_cliente=?";
        try {
            con= cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id_cliente);
            rs= ps.executeQuery();
            if (rs.next()) {
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNombre_cliente(rs.getString("nombre_cliente"));
                cliente.setUbicacion_cliente(rs.getString("ubicacion_cliente"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDescripcion_cliente(rs.getString("descripcio_cliente"));  
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cliente;
        
    }*/
}

