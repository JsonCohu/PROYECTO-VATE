/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author BARBARA
 */
public class Registro {
    private int id_registro;
    private String nombre_registro;
    private String lugar_registro;
    private String descripcion_registro;
    private int tipo_registro;
    private int empresa_registro;
    private String fecha_servicio;

    public Registro() {
    }

    public Registro(int id_registro, String nombre_registro, String lugar_registro, String descripcion_registro, int tipo_registro, int empresa_registro, String fecha_servicio) {
        this.id_registro = id_registro;
        this.nombre_registro = nombre_registro;
        this.lugar_registro = lugar_registro;
        this.descripcion_registro = descripcion_registro;
        this.tipo_registro = tipo_registro;
        this.empresa_registro = empresa_registro;
        this.fecha_servicio = fecha_servicio;
    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public String getNombre_registro() {
        return nombre_registro;
    }

    public void setNombre_registro(String nombre_registro) {
        this.nombre_registro = nombre_registro;
    }

    public String getLugar_registro() {
        return lugar_registro;
    }

    public void setLugar_registro(String lugar_registro) {
        this.lugar_registro = lugar_registro;
    }

    public String getDescripcion_registro() {
        return descripcion_registro;
    }

    public void setDescripcion_registro(String descripcion_registro) {
        this.descripcion_registro = descripcion_registro;
    }

    public int getTipo_registro() {
        return tipo_registro;
    }

    public void setTipo_registro(int tipo_registro) {
        this.tipo_registro = tipo_registro;
    }

    public int getEmpresa_registro() {
        return empresa_registro;
    }

    public void setEmpresa_registro(int empresa_registro) {
        this.empresa_registro = empresa_registro;
    }

    public String getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }
    
    
    
}
