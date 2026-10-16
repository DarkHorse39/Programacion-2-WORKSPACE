/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;
import gt.edu.sistemas.ventas.modelo.DetalleFactura;
import java.util.List;
/**
 *
 * @author jeffe
 */

public interface DetalleFacturaDAO{
    
    void guardar (DetalleFactura detalle);
    List<DetalleFactura> listar ();
    
    void actualizar (DetalleFactura detalle);
    
    void eliminar (int idDetalle);
}



