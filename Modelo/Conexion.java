/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class Conexion {
    Connection con;
   
    public Connection getConnection(){
        try{
            String myBD="jdbc:mysql://localhost:33065/callcenter?serverTimezone=UTC";
            con=DriverManager.getConnection(myBD,"root","");
            return con;
        
        }catch(SQLException e){
            System.out.println(e.toString());
        
        
        
        
        
        
        
        
        /*String host="localhost";
        String puerto="33065";
        String nameDB="callcenter";
        String usuario="root";
        String pass="";
        
        String driver="com.mysql.cj.jdbc.Driver";
        
        String databaseURL="jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"useSSL=false";
                
           try{
               Class.forName(driver);
               con =DriverManager.getConnection(databaseURL,usuario,pass);
           }catch  (Exception ex){
               
               
           }
           public Connection {
               return con;
           }
        
        
        try{
            String url="http://localhost:33065/callcenter";
            con= DriverManager.getConnection(url,"root",".");
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());
            
        }
        return null;
        /*try {
    String url = "jdbc:mysql://localhost:33065/callcenter";
    String usuario = "root";
    String contraseña = ".";

    Connection con = DriverManager.getConnection(url, usuario, contraseña);
    return con;
} catch (SQLException e) {
    e.printStackTrace();  Imprime el rastro de la excepción para obtener más información
    // Aquí podrías lanzar una excepción personalizada, mostrar un mensaje de error al usuario o tomar otras medidas adecuadas según tus necesidades.
    return null;*/


    }
        return null;
    }

    
}
