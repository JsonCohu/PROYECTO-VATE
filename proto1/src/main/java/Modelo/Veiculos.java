/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author BARBARA
 */
public class Veiculos {
    
    private int id_trasnporte;
    private int capacidad;
    private String nombre_conductor;
    private String placa;
    private int tipo;

    public Veiculos() {
    }

    public Veiculos(int id_trasnporte, int capacidad, String nombre_conductor, String placa, int tipo) {
        this.id_trasnporte = id_trasnporte;
        this.capacidad = capacidad;
        this.nombre_conductor = nombre_conductor;
        this.placa = placa;
        this.tipo = tipo;
    }

    public int getId_trasnporte() {
        return id_trasnporte;
    }

    public void setId_trasnporte(int id_trasnporte) {
        this.id_trasnporte = id_trasnporte;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre_conductor() {
        return nombre_conductor;
    }

    public void setNombre_conductor(String nombre_conductor) {
        this.nombre_conductor = nombre_conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
