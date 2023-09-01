/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_junniorsauceda;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Junnior Sauceda
 */
public class Vehiculo {
    private String Marca,Modelo,Id;
    private Color color;
    private int Anio;
    private double Precio;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String Modelo, String Id, Color color, int Anio, double Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Id = Id;
        this.color = color;
        this.Anio = Anio;
        this.Precio = Precio;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return Marca + " " + Modelo;
    }
    
    
    
}
