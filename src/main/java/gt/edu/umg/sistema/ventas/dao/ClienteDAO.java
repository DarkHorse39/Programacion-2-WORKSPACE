/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;

import gt.edu.sistemas.ventas.modelo.Cliente;
import java.util.List;

/**
 *
 * @author jeffe
 */
public interface ClienteDAO {
    
    void guardar(Cliente cliente);
    
    List <Cliente> listar();
    
    void actualizar(Cliente cliente);
    
    void eliminar(int idCliente);
    
}
