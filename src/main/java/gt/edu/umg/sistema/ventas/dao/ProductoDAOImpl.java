/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;
import gt.edu.umg.sistema.ventas.conexion.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import gt.edu.sistemas.ventas.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class ProductoDAOImpl implements ProductoDAO {
    
    
@Override
public void descontarStock(
        int idProducto,
        int cantidad) {
    
    String sql =
        "UPDATE Producto "
      + "SET Stock = Stock - ?"
      + "WHERE IdProducto = ? ";
    
    try (
        Connection con = ConexionDB.conectar();
        PreparedStatement ps = 
                con.prepareStatement(sql)
    ){
        
        ps.setInt(1, cantidad);
        ps.setInt(2, idProducto);
        
        ps.executeUpdate();
    } catch (SQLException e) {
        
        
        
         
        e.printStackTrace();
    }
}
    
    @Override
public void guardar(Producto producto) {

    String sql =
            "INSERT INTO Producto "
            + "(Nombre, Descripcion, Precio, Stock) "
            + "VALUES (?, ?, ?, ?)";

    try (
            Connection con = ConexionDB.conectar();
            PreparedStatement ps =
                    con.prepareStatement(sql)
    ) {

        ps.setString(1, producto.getNombre());
        ps.setString(2, producto.getDescripcion());
        ps.setDouble(3, producto.getPrecio());
        ps.setInt(4, producto.getStock());

        ps.executeUpdate();

        System.out.println("Producto guardado correctamente.");

    } catch (SQLException e) {

        e.printStackTrace();
    }
}
    
@Override
public void actualizar(Producto producto) {

    String sql =
            "UPDATE Producto SET "
            + "Nombre=?, "
            + "Descripcion=?, "
            + "Precio=?, "
            + "Stock=? "
            + "WHERE IdProducto=?";

    try (
            Connection con = ConexionDB.conectar();
            PreparedStatement ps =
                    con.prepareStatement(sql)
    ) {

        ps.setString(1, producto.getNombre());
        ps.setString(2, producto.getDescripcion());
        ps.setDouble(3, producto.getPrecio());
        ps.setInt(4, producto.getStock());
        ps.setInt(5, producto.getIdProducto());

        ps.executeUpdate();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}@Override
public void eliminar(int idProducto) {

    String sql =
            "DELETE FROM Producto "
            + "WHERE IdProducto=?";

    try (
            Connection con = ConexionDB.conectar();
            PreparedStatement ps =
                    con.prepareStatement(sql)
    ) {

        ps.setInt(1, idProducto);

        ps.executeUpdate();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}


   @Override
public List<Producto> listar() {

    List<Producto> lista =
            new ArrayList<>();

    String sql =
            "SELECT * FROM Producto";

    try (
            Connection con = ConexionDB.conectar();
            Statement st =
                    con.createStatement();
            ResultSet rs =
                    st.executeQuery(sql)
    ) {

        while (rs.next()) {

            Producto producto =
                    new Producto();

            producto.setIdProducto(
                    rs.getInt("IdProducto"));

            producto.setNombre(
                    rs.getString("Nombre"));

            producto.setDescripcion(
                    rs.getString("Descripcion"));

            producto.setPrecio(
                    rs.getDouble("Precio"));

            producto.setStock(
                    rs.getInt("Stock"));

            lista.add(producto);
        }

    } catch (SQLException e) {

        e.printStackTrace();
    }

    return lista;
 }
}
