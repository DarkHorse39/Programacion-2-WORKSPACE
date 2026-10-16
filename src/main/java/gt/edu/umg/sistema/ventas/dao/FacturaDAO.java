/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;
import gt.edu.sistemas.ventas.modelo.Factura;
import java.util.List;
/**
 *
 * @author jeffe
 */
public interface FacturaDAO {
    
    int guardar(Factura factura);

    List<Factura> listar();

    void actualizar(Factura factura);

    void eliminar(int idFactura);
    
}
