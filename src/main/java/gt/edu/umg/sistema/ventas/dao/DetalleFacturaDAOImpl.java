/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;

import gt.edu.sistemas.ventas.modelo.DetalleFactura;
import gt.edu.umg.sistema.ventas.conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class DetalleFacturaDAOImpl implements DetalleFacturaDAO {
    
    @Override
    public void guardar(DetalleFactura detalle) {
        
        String sql =
                
                "INSERT INTO DetalleFactura "
              + "(IdFactura, IdProducto, Producto, Cantidad, Precio, Descripcion, Subtotal) "
              + "Values (?, ?, ?, ?, ?, ?, ?)";
        
        try (
                Connection con = ConexionDB.conectar();
                PreparedStatement ps = con.prepareStatement(sql)
        ){
            
            ps.setInt(1, detalle.getIdFactura());
            ps.setInt(2, detalle.getIdProducto());
            ps.setString(3, detalle.getProducto());
            ps.setInt(4, detalle.getCantidad());
            ps.setDouble(5, detalle.getPrecio());
            ps.setString(6, detalle.getDescripcion());
            ps.setDouble(7, detalle.getSubtotal());
            
            ps.executeUpdate();
            
            System.out.println("Detalle guardado.");
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }                            
    }
    
    @Override
    public List<DetalleFactura> listar() {
        return new ArrayList<>();
    }
    
    @Override
    public void actualizar (DetalleFactura detalle) {
        throw new UnsupportedOperationException("Pendiente");
    }
    
    @Override
    public void eliminar (int idDetalle) {
        throw new UnsupportedOperationException("Pendiente");
    }
    
}
