/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.sistemas.ventas.modelo;

/**
 *
 * @author jeffe
 */
public class Factura {
    private int idFactura;
    private String numeroFactura;
    private String fecha;
    private String cliente;
    private String nit;
    private double total;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getNumeroFactura() {
       return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
       this.numeroFactura = numeroFactura;
    }

    public String getFecha() {
       return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
       return cliente;
    }

    public void setCliente(String cliente) {
       this.cliente = cliente;
    }

    public String getNit() {
       return nit;
    }

    public void setNit(String nit) {
       this.nit = nit;
    }

    public double getTotal() {
       return total;
    }

    public void setTotal(double total) {
       this.total = total;
    }
}
