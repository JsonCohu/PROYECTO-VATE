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
public class VeiculosDAO {
    
     Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarVeiculo(Veiculos vei){
        String sql="INSERT INTO tabla_transportes (id_trasnporte,nombre_conductor,placa,tipo,capacidad)VALUES(?,?,?,?,? )";
        try{
            con=cn.getConnection();
            ps= con.prepareStatement(sql);
            
            ps.setInt(1,vei.getId_trasnporte());
            ps.setString(2, vei.getNombre_conductor());
            ps.setString(3, vei.getPlaca());
            ps.setInt(4,vei.getTipo());
            ps.setInt(5,vei.getCapacidad());
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
    public List ListarVeiculos(){
        List<Veiculos> ListaVe = new ArrayList();
        String sql="SELECT*FROM tabla_transportes";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Veiculos vei=new Veiculos();
                vei.setId_trasnporte(rs.getInt("id_trasnporte"));
                vei.setNombre_conductor(rs.getString("nombre_conductor"));
                vei.setPlaca(rs.getString("placa"));
                vei.setTipo(rs.getInt("tipo"));
                vei.setCapacidad(rs.getInt("capacidad"));
                ListaVe.add(vei);
                
            }
        }catch (java.sql.SQLException e){
            System.out.println(e.toString());
        }
        return ListaVe;
    }
     public boolean EliminarVeiculo(int id_trasnporte){
        String sql="DELETE FROM tabla_transportes WHERE id_trasnporte=? ";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1,id_trasnporte );
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
     
     public boolean ModificarVeiculo(Veiculos ve){
        String sql="UPDATE tabla_transportes SET nombre_conductor=?,placa=?,tipo=?,capacidad=? WHERE id_trasnporte=?";
        try {
            ps =con. prepareStatement(sql);
            
            ps.setString(1,ve.getNombre_conductor());
            ps.setString(2,ve.getPlaca());
            ps.setInt(3, ve.getTipo());
            ps.setInt(4, ve.getCapacidad());
            ps.setInt(5,ve.getId_trasnporte());
            
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
     
    
}
