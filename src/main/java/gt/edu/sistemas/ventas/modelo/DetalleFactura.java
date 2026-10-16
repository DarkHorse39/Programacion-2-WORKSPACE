/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.sistemas.ventas.modelo;

/**
 *
 * @author jeffe
 */
public class DetalleFactura {
    
    private int idFactura;
    private int idDetalle;
    private String producto;
    private int cantidad;
    private double precio;
    private String descripcion;
    private double subtotal;
    private int idProducto;
    
    public int getIdProducto() {
        return idProducto;
    }
    
    public void setIdProducto (int idProducto) {
        this.idProducto = idProducto;
    }
    
     public int getIdFactura() {
        return idFactura;
    }
    
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    

    public String getProducto() {
        return producto;
    }
    
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
