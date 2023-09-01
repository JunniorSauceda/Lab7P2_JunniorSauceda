/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Vendedor {
    private String Nombre;
    private int Cantidad;
    private double Money;

    public Vendedor() {
    }

    public Vendedor(String Nombre, int Cantidad, double Money) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Money = Money;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
