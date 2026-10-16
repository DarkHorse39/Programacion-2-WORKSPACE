/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.controlador;

import gt.edu.umg.sistema.ventas.dao.ProductoDAOImpl;
import gt.edu.sistemas.ventas.modelo.Producto;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class ProductoController {
    
    private ProductoDAOImpl dao;
    
    public ProductoController() {
        dao = new ProductoDAOImpl ();
    }
    
    public void guardar (Producto producto) {
        dao.guardar(producto);
    }
    
    public List<Producto> getProducto() {
        return dao.listar();
            }
    
    public void eliminar(int idProducto) {
        dao.eliminar(idProducto);
    }
    
    public void actualizar(Producto producto) {
        dao.actualizar(producto);
    }
}
