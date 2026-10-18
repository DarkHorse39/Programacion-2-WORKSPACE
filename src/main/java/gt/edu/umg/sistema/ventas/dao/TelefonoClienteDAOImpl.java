/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.dao;

import gt.edu.sistemas.ventas.modelo.TelefonoCliente;
import gt.edu.umg.sistema.ventas.dao.TelefonoClienteDao;
import gt.edu.umg.sistema.ventas.conexion.ConexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffe
 */
public class TelefonoClienteDAOImpl 
        implements TelefonoClienteDao {
    
    @Override
    public void guardar(TelefonoCliente telefono) {

        String sql =
                "INSERT INTO TelefonoCliente "
              + "(IdCliente, Telefono) "
              + "VALUES (?, ?)";

        try (
                Connection con = ConexionDB.conectar();
                PreparedStatement ps =
                        con.prepareStatement(sql)
        ) {

            ps.setInt(1, telefono.getIdCliente());
            ps.setString(2, telefono.getTelefono());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(
            "Error guardando telefono");

            e.printStackTrace();
        }
    }
    
    @Override
    public List<TelefonoCliente> listarPorCliente(
            int idCliente) {

        List<TelefonoCliente> lista =
                new ArrayList<>();

        String sql =
                "SELECT * "
              + "FROM TelefonoCliente "
              + "WHERE IdCliente = ?";

        try (
                Connection con = ConexionDB.conectar();
                PreparedStatement ps =
                        con.prepareStatement(sql)
        ) {

            ps.setInt(1, idCliente);

            ResultSet rs =
                    ps.executeQuery();

            while (rs.next()) {

                TelefonoCliente telefono =
                        new TelefonoCliente();

                telefono.setIdTelefono(
                        rs.getInt("IdTelefono"));

                telefono.setIdCliente(
                        rs.getInt("IdCliente"));

                telefono.setTelefono(
                        rs.getString("Telefono"));

                lista.add(telefono);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return lista;
    }
    
}
