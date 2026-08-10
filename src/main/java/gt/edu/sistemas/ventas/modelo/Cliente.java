/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.sistemas.ventas.modelo;

/**
 *
 * @author jeffe
 */
public class Cliente {
    
    private int idCliente;
    private String nit;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public String getNit() {
        return nit;
    }
   
    public void setNit(String nit) {
        this.nit = nit;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo (String correo) {
        this.correo = correo;
    }
    
    public String gettDireccion(){
        return direccion;
    }
    
    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }   
}
