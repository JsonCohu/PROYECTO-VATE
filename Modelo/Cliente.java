/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author BARBARA
 */
public class Cliente {
    private int id_cliente;
    private int telefono;
    private String nombre_cliente;
    private String ubicacion_cliente;
    private String descripcion_cliente;
    

    public Cliente() {
    }

    public Cliente(int id_cliente, int telefono, String nombre_cliente, String ubicacion_cliente, String descripcion_cliente) {
        this.id_cliente = id_cliente;
        this.telefono = telefono;
        this.nombre_cliente = nombre_cliente;
        this.ubicacion_cliente = ubicacion_cliente;
        this.descripcion_cliente = descripcion_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getUbicacion_cliente() {
        return ubicacion_cliente;
    }

    public void setUbicacion_cliente(String ubicacion_cliente) {
        this.ubicacion_cliente = ubicacion_cliente;
    }

    public String getDescripcion_cliente() {
        return descripcion_cliente;
    }

    public void setDescripcion_cliente(String descripcion_cliente) {
        this.descripcion_cliente = descripcion_cliente;
    }

    

    
}