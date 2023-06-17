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
public class RegistroDAO {
    
    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarRegistro(Registro regi){
        String sql="INSERT INTO tabla_registro (id_registro,nombre_registro,lugar_registro,tipo_registro,empresa_registro,fecha_servicio,descripcion_registro)VALUES(?,?,?,?,?,?,? )";
        try{
            con=cn.getConnection();
            ps= con.prepareStatement(sql);
            
            ps.setInt(1,regi.getId_registro());
            ps.setString(2, regi.getNombre_registro());
            ps.setString(3, regi.getLugar_registro());
            ps.setInt(4,regi.getTipo_registro());
            ps.setInt(5,regi.getEmpresa_registro());
            ps.setString(6,regi.getFecha_servicio());
            ps.setString(7,regi.getDescripcion_registro());
            
            
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
    public List ListarRegistro(){
    List<Registro> RegistroR = new ArrayList();
        String sql="SELECT*FROM tabla_registro";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Registro reg=new Registro();
                reg.setId_registro(rs.getInt("id_registro"));
                reg.setNombre_registro(rs.getString("nombre_registro"));
                reg.setLugar_registro(rs.getString("lugar_registro"));
                reg.setTipo_registro(rs.getInt("tipo_registro"));
                reg.setEmpresa_registro(rs.getInt("empresa_registro"));
                reg.setFecha_servicio(rs.getString("fecha_servicio"));
                reg.setDescripcion_registro(rs.getString("descripcion_registro"));
                
                RegistroR.add(reg);
                
            }
        }catch (java.sql.SQLException e){
            System.out.println(e.toString());
        }
        return RegistroR;
    }
        
        
        public Registro Buscarregis( int id_registro){
             List<Registro> Registrob = new ArrayList();
        String sql="SELECT*FROM tabla_registro WHERE id_registro";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Registro reg=new Registro();
                reg.setId_registro(rs.getInt("id_registro"));
                reg.setNombre_registro(rs.getString("nombre_registro"));
                reg.setLugar_registro(rs.getString("lugar_registro"));
                reg.setTipo_registro(rs.getInt("tipo_registro"));
                reg.setEmpresa_registro(rs.getInt("empresa_registro"));
                reg.setFecha_servicio(rs.getString("fecha_servicio"));
                reg.setDescripcion_registro(rs.getString("descripcion_registro"));
                
                Registrob.add(reg);
                
            }
        }catch (java.sql.SQLException e){
            System.out.println(e.toString());
        }
        return (Registro) Registrob;
        
    }
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            /*Registro registro= new Registro();
            String sql = "SELESCT*FROM tabla_registro WHERE id_registro=?";
            try{
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                ps.setInt(1, id_registro);
                rs= ps.executeQuery();
                if(rs.next()){
                    registro.setId_registro(rs.getInt("id_registro"));
                    registro.setNombre_registro(rs.getString("nombre_registro"));
                    registro.setLugar_registro(rs.getString("lugar_registro"));
                    registro.setTipo_registro(rs.getInt("tipo_registro"));
                    registro.setEmpresa_registro(rs.getInt("empresa_registro"));
                    registro.setFecha_servicio(rs.getString("fecha_registro"));
                    registro.setDescripcion_registro(rs.getString("descripcion_registro"));
                }
            }catch (SQLException e){
                System.out.println(e.toString());
            }
            return registro;*/

    

    


}
