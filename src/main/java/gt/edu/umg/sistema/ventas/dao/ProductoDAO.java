/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;

import gt.edu.sistemas.ventas.modelo.Producto;
import java.util.List;
/**
 *
 * @author jeffe
 */

public interface ProductoDAO{
    void guardar(Producto producto);
    List <Producto> listar();
    void actualizar(Producto producto);
    void eliminar(int idProducto);
    void descontarStock(
             int idProducto,
             int cantidad
    );
}

//public class ProductoDAO {
//  }
