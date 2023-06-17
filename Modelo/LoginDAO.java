/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author BARBARA
 */
public class LoginDAO {
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn= new Conexion();
    
    public login log(String correo, String pass){
        login l=new login();
        String sql="SELECT * FROM tabla_usuario WHERE correo_usuario=? AND contraseña_usuario = ?";
        try{
            con= cn.getConnection();
            ps =con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            if(rs.next()){
                l.setId_usuario(rs.getInt("id_usuario"));
                l.setCargo_usuario(rs.getString("cargo_usuario"));
                l.setNombre_usuario(rs.getString("nombre_usuario"));
                l.setContraseña_usuario(rs.getString("contraseña_usuario"));
                l.setCorreo_usuario(rs.getString("correo_usuario"));
              }
            
                  
        }catch(SQLException e){
            System.out.println(e.toString());
        
        }
        return l;
    }
    
    public boolean Registrar(login reg){
        String slq="INSERT INTO tabla_usuario( id_usuario, nombre_usuario,contraseña_usuario, correo_usuario,cargo_usuario)VALUES(?,?,?,?,?)";
        try {
            con= cn.getConnection();
            ps=con.prepareStatement(slq);
            ps.setInt(1, reg.getId_usuario());
            ps.setString(2, reg.getNombre_usuario());
            ps.setString(3, reg.getContraseña_usuario());
            ps.setString(4, reg.getCorreo_usuario());
            ps.setString(5, reg.getCargo_usuario());
            ps.execute();
            return true;
            
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
}
