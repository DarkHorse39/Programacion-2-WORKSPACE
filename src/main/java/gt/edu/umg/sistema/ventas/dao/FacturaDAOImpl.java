/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;

import gt.edu.sistemas.ventas.modelo.Factura;
import gt.edu.umg.sistema.ventas.conexion.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jeffe
 */
public class FacturaDAOImpl implements FacturaDAO {

    @Override
    public int guardar(Factura factura) {
        String sql =
            "INSERT INTO Factura "
          + "(NumeroFactura, Fecha, Cliente, Nit, Total) "
          + "VALUES (?, ?, ?, ?, ?)";

        try (
            Connection con = ConexionDB.conectar();
            PreparedStatement ps = con.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS
            );
        ) {

            ps.setString(1, factura.getNumeroFactura());
            ps.setString(2, factura.getFecha());
            ps.setString(3, factura.getCliente());
            ps.setString(4, factura.getNit());
            ps.setDouble(5, factura.getTotal());

            ps.executeUpdate();
            
            ResultSet rs =
                    ps.getGeneratedKeys();
            
            if (rs.next()) {
                return rs.getInt(1);
            }

            System.out.println("Factura guardada correctamente.");

        } catch (SQLException e) {

            System.out.println("Error al guardar factura:");
        }
        return -1;
    }
    
    public void descontarStock(
            int idProducto,
            int cantidad) {
        String sql = 
                "UPDATE Producto "
              + "Set Stock = Stock - ? "
              + "WHERE  IdProducto = ?";
        
        try (
                Connection con = ConexionDB.conectar();
                PreparedStatement ps =
                        con.prepareStatement(sql)
        ){
            ps.setInt(1, cantidad);
            ps.setInt(2, idProducto);
            
            ps.executeUpdate();
        } catch (SQLException e){
            
            e.printStackTrace();
        }
    }

    @Override
    public List<Factura> listar() {
        return new ArrayList<>();
    }

    @Override
    public void actualizar(Factura factura) {
        throw new UnsupportedOperationException("Pendiente");
    }

    @Override
    public void eliminar(int idFactura) {
        throw new UnsupportedOperationException("Pendiente");
    }
}
