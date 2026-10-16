/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.controlador;

import gt.edu.sistemas.ventas.modelo.Factura;
import gt.edu.umg.sistema.ventas.dao.FacturaDAOImpl;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class FacturaController {
    private FacturaDAOImpl dao;

    public FacturaController() {
        dao = new FacturaDAOImpl();
    }

    public int guardar(Factura factura) {
        return dao.guardar(factura);
    }

    public List<Factura> getFacturas() {
        return dao.listar();
    }

    public void actualizar(Factura factura) {
        dao.actualizar(factura);
    }

    public void eliminar(int idFactura) {
        dao.eliminar(idFactura);
    }
    
}
