/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Venta {
    private Vendedor vendedor=new Vendedor();
    private Cliente comprador=new Cliente();
    private Vehiculo carro=new Vehiculo();
    private double Coste;

    public Venta() {
        
    }

    public Venta(double Coste) {
        this.Coste = Coste;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
        setCoste(carro.getPrecio());
    }

    public double getCoste() {
        return Coste;
    }

    public void setCoste(double Coste) {
        this.Coste = Coste;
    }

    @Override
    public String toString() {
        return "Comprador: "+comprador.getNombre()+" Vendedor:"+vendedor.getNombre();
    }
    
    
    
}
