/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.sistemas.ventas.modelo;

/**
 *
 * @author jeffe
 */
public class TelefonoCliente {
    
    private int idTelefono;
    private int idCliente;
    private String telefono;
    
    public int getIdTelefono() {
        return idTelefono;
    }
    
    public void setIdTelefono(int idTelefono) {
        this.idTelefono =  idTelefono;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(int idCliente ) {
        this.idCliente = idCliente;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
