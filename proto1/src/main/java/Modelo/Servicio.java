/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author BARBARA
 */
public class Servicio {
    private int id_servicio;
    private int id_cliente;
    private int id_trasnporte;
    private int estado;
    private String fecha_servicio;
    private String hora_servicio;
    private int tipo_servicio;
    private String descripcion_servicio;
    
    public Servicio(){
        
    }

    public Servicio(int id_servicio, int id_cliente, int id_trasnporte, int estado, String fecha_servicio, String hora_servicio, int tipo_servicio, String descripcion_servicio) {
        this.id_servicio = id_servicio;
        this.id_cliente = id_cliente;
        this.id_trasnporte = id_trasnporte;
        this.estado = estado;
        this.fecha_servicio = fecha_servicio;
        this.hora_servicio = hora_servicio;
        this.tipo_servicio = tipo_servicio;
        this.descripcion_servicio = descripcion_servicio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_trasnporte() {
        return id_trasnporte;
    }

    public void setId_trasnporte(int id_trasnporte) {
        this.id_trasnporte = id_trasnporte;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public String getHora_servicio() {
        return hora_servicio;
    }

    public void setHora_servicio(String hora_servicio) {
        this.hora_servicio = hora_servicio;
    }

    public int getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(int tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public String getDescripcion_servicio() {
        return descripcion_servicio;
    }

    public void setDescripcion_servicio(String descripcion_servicio) {
        this.descripcion_servicio = descripcion_servicio;
    }
    
    
}
