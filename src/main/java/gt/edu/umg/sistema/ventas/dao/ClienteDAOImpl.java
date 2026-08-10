/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;

import gt.edu.sistemas.ventas.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class ClienteDAOImpl implements ClienteDAO {
    
    private final List <Cliente> clientes = new ArrayList<>();
    
    @Override
    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }
    
    @Override
    public List <Cliente> listar() {
        return clientes;
    }
    
    @Override
    public void actualizar (Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getIdCliente() == cliente.getIdCliente()) {
                clientes.set(i, cliente);
                return;
            }
        }
        //throw new UnsupportedOperationException("Método Actualizar Pendiente, favor verificar.");
    }
    
    @Override
    public void eliminar(int idCliente) {
        clientes.removeIf(
                cliente -> cliente.getIdCliente() == idCliente);
    }
}
                                                                                               