/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;
import gt.edu.umg.sistema.ventas.conexion.ConexionDB;

import gt.edu.sistemas.ventas.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    String sql =
            "INSERT INTO Cliente "
            + "(Nit, Nombre, Telefono, Correo, Direccion) "
            + "VALUES (?, ?, ?, ?, ?)";

    try (
            Connection con = ConexionDB.conectar();
            PreparedStatement ps =
                    con.prepareStatement(sql)
    ) {

        ps.setString(1, cliente.getNit());
        ps.setString(2, cliente.getNombre());
        ps.setString(3, cliente.getTelefono());
        ps.setString(4, cliente.getCorreo());
        ps.setString(5, cliente.getDireccion());

        ps.executeUpdate();

        System.out.println("Cliente guardado correctamente.");

    } catch (SQLException e) {

        System.out.println("Error al guardar cliente:");
        e.printStackTrace();
    }
}
    
    @Override
public List<Cliente> listar() {

    List<Cliente> lista = new ArrayList<>();

    String sql = "SELECT * FROM Cliente";

    try (
            Connection con = ConexionDB.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)
    ) {

        while (rs.next()) {

            Cliente cliente = new Cliente();

            cliente.setIdCliente(
                    rs.getInt("IdCliente"));

            cliente.setNit(
                    rs.getString("Nit"));

            cliente.setNombre(
                    rs.getString("Nombre"));

            cliente.setTelefono(
                    rs.getString("Telefono"));

            cliente.setCorreo(
                    rs.getString("Correo"));

            cliente.setDireccion(
                    rs.getString("Direccion"));

            lista.add(cliente);
        }

    } catch (SQLException e) {

        System.out.println("Error al listar clientes:");
        e.printStackTrace();
    }

    return lista;
}
    
    @Override
public void actualizar(Cliente cliente) {

    String sql =
            "UPDATE Cliente SET "
            + "Nit=?, "
            + "Nombre=?, "
            + "Telefono=?, "
            + "Correo=?, "
            + "Direccion=? "
            + "WHERE IdCliente=?";

    try (
            Connection con = ConexionDB.conectar();
            PreparedStatement ps =
                    con.prepareStatement(sql)
    ) {

        ps.setString(1, cliente.getNit());
        ps.setString(2, cliente.getNombre());
        ps.setString(3, cliente.getTelefono());
        ps.setString(4, cliente.getCorreo());
        ps.setString(5, cliente.getDireccion());
        ps.setInt(6, cliente.getIdCliente());

        ps.executeUpdate();

    } catch (SQLException e) {

        e.printStackTrace();
    }
}
    
   @Override
public void eliminar(int idCliente) {

    String sql =
            "DELETE FROM Cliente "
            + "WHERE IdCliente = ?";

    try (
            Connection con = ConexionDB.conectar();
            PreparedStatement ps =
                    con.prepareStatement(sql)
    ) {

        ps.setInt(1, idCliente);

        ps.executeUpdate();

    } catch (SQLException e) {

        e.printStackTrace();
    }
 }
}
                                                                                               
