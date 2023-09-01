/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Cliente {
    private String Nombre,Profesion;
    private int Edad,Carros;
    private double sueldo;

    public Cliente() {
    }

    public Cliente(String Nombre, String Profesion, int Edad, int Carros, double sueldo) {
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Edad = Edad;
        this.Carros = Carros;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getCarros() {
        return Carros;
    }

    public void setCarros(int Carros) {
        this.Carros = Carros;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
