/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author BARBARA
 */
public class Usuario {
    private int id_usuario;
    private String nombre_usuario;
    private String cargo_usuario;
    private String contraseña_usuario;
    private String correo_usuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre_usuario, String cargo_usuario, String contraseña_usuario, String correo_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.cargo_usuario = cargo_usuario;
        this.contraseña_usuario = contraseña_usuario;
        this.correo_usuario = correo_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCargo_usuario() {
        return cargo_usuario;
    }

    public void setCargo_usuario(String cargo_usuario) {
        this.cargo_usuario = cargo_usuario;
    }

    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }
    
    
    
    
}
