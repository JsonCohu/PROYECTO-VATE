/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author BARBARA
 */
public class UsuarioDAO {
    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarUsuario(Usuario usu){
        String sql="INSERT INTO tabla_usuario (id_usuario,nombre_usuario,cargo_usuario,contraseña_usuario,correo_usuario)VALUES(?,?,?,?,? )";
        try{
            con=cn.getConnection();
            ps= con.prepareStatement(sql);
            
            ps.setInt(1,usu.getId_usuario());
            ps.setString(2, usu.getNombre_usuario());
            ps.setString(3, usu.getCargo_usuario());
            ps.setString(4,usu.getContraseña_usuario());
            ps.setString(5,usu.getCorreo_usuario());
            ps.execute();
            return true;
            
        }catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
           
        }finally{
            try{
                con.close();
            }catch (java.sql.SQLException e){
                System.out.println(e.toString());
        }
        }     
        }
    public List ListarUsuario(){
        List<Usuario> UsuarioU = new ArrayList();
        String sql="SELECT*FROM tabla_usuario";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Usuario Uw=new Usuario();
                Uw.setId_usuario(rs.getInt("id_usuario"));
                Uw.setNombre_usuario(rs.getString("nombre_usuario"));
                Uw.setCargo_usuario(rs.getString("cargo_usuario"));
                Uw.setContraseña_usuario(rs.getString("contraseña_usuario"));
                Uw.setCorreo_usuario(rs.getString("correo_usuario"));
                UsuarioU.add(Uw);
                
            }
        }catch (java.sql.SQLException e){
            System.out.println(e.toString());
        }
        return UsuarioU;
    }
    public boolean ModificarUsuario(Usuario usu){
        String sql="UPDATE tabla_usuario SET nombre_usuario=?,cargo_usuario=?,contraseña_usuario=?,correo_usuario=? WHERE id_usuario=?";
        try {
            ps =con. prepareStatement(sql);
            
            ps.setString(1,usu.getNombre_usuario());
            ps.setString(2,usu.getCargo_usuario());
            ps.setString(3, usu.getContraseña_usuario());
            ps.setString(4, usu.getContraseña_usuario());
            ps.setInt(5,usu.getId_usuario());
            
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
        }}
}
