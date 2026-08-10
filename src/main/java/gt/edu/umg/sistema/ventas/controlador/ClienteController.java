/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.controlador;

import gt.edu.umg.sistema.ventas.dao.ClienteDAOImpl;
import gt.edu.sistemas.ventas.modelo.Cliente;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class ClienteController {
    
    private ClienteDAOImpl dao;
    
    public ClienteController() {
        dao = new ClienteDAOImpl();
    }
    
    public void guardar(Cliente cliente) {
        dao.guardar(cliente);
    }
    
    public List<Cliente> getClientes() {
        return dao.listar();
    }

    public List<Cliente> getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
