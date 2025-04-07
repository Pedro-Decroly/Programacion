package org.example;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SQLAccessMercaDaw {

    //Mostrar Productos
    public List<Inventario> getMostrartodos() {
        List<Inventario> productos = new LinkedList<>();
        //Sentencia SQL
        String sql = "SELECT * FROM Inventario";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet dataSet = statement.executeQuery(sql);){
            while (dataSet.next()){
                int Id = dataSet.getInt(1);
                String Referencia = dataSet.getString(2);
                String Nombre = dataSet.getString(3);
                String Descripcion = dataSet.getString(4);
                int Tipo = dataSet.getInt(5);
                int Cantidad = dataSet.getInt(6);
                double Precio = dataSet.getDouble(7);
                int Descuento = dataSet.getInt(8);
                int IVA = dataSet.getInt(9);
                boolean AplicarDto = dataSet.getBoolean(10);

                Inventario p1 = new Inventario();
                productos.add(p1);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return productos;
    }

    //Buscar por Referencia
    public List<Inventario> getBuscarReferencia(String Referencia) {

        return List.of();
    }

    public List<Producto> getByRef(String ref){
        List<Producto> ProductoReference = new LinkedList<>();

        String getRef = "SELECT * from producto WHERE referencia = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(getRef);) {

            statement.setString(1, ref);
            ResultSet dataSet = statement.executeQuery();

            while(dataSet.next()){

                int id = dataSet.getInt(1);
                String referencia = dataSet.getString(2);
                String nombre = dataSet.getString(3);
                String descripcion = dataSet.getString(4);
                int tipo = dataSet.getInt(5);
                int cantidad = dataSet.getInt(6);
                double precio = dataSet.getDouble(7);
                int descuento = dataSet.getInt(8);
                int iva = dataSet.getInt(9);
                boolean aplicarDto = dataSet.getBoolean(10);

                Producto c1 =  new Producto(referencia, nombre, descripcion, tipo, cantidad, precio, descuento, iva, aplicarDto);
                ProductoReference.add(c1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ProductoReference;
    }

    public List<Producto> getByTipo(String tip){
        List<Producto> ProductoTipos = new LinkedList<>();

        String getTipos = "SELECT * from producto WHERE tipo = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(getTipos);) {

            statement.setString(1, tip);
            ResultSet dataSet = statement.executeQuery();

            while(dataSet.next()){

                int id = dataSet.getInt(1);
                String referencia = dataSet.getString(2);
                String nombre = dataSet.getString(3);
                String descripcion = dataSet.getString(4);
                int tipo = dataSet.getInt(5);
                int cantidad = dataSet.getInt(6);
                double precio = dataSet.getDouble(7);
                int descuento = dataSet.getInt(8);
                int iva = dataSet.getInt(9);
                boolean aplicarDto = dataSet.getBoolean(10);

                Producto c1 =  new Producto(referencia, nombre, descripcion, tipo, cantidad, precio, descuento, iva, aplicarDto);
                ProductoTipos.add(c1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ProductoTipos;
    }

    public List<Producto> getProductoByCantidad(int cant){
        List<Producto> ProductoCantidad = new LinkedList<>();

        String getCantidad = "SELECT * from producto WHERE cantidad = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(getCantidad);) {

            statement.setInt(1, cant);
            ResultSet dataSet = statement.executeQuery();

            while(dataSet.next()){

                int id = dataSet.getInt(1);
                String referencia = dataSet.getString(2);
                String nombre = dataSet.getString(3);
                String descripcion = dataSet.getString(4);
                int tipo = dataSet.getInt(5);
                int cantidad = dataSet.getInt(6);
                double precio = dataSet.getDouble(7);
                int descuento = dataSet.getInt(8);
                int iva = dataSet.getInt(9);
                boolean aplicarDto = dataSet.getBoolean(10);

                Producto c1 =  new Producto(referencia, nombre, descripcion, tipo, cantidad, precio, descuento, iva, aplicarDto);
                ProductoCantidad.add(c1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ProductoCantidad;
    }

    public int getInsertarProducto(Producto producto){
        int response = -1;
        String insertarProd = "INSERT INTO producto (referencia, nombre, descripcion, tipo, cantidad, precio, descuento, iva, aplicarDto)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(insertarProd);) {


            statement.setNString(1, producto.getReferencia());
            statement.setNString(2, producto.getNombre());
            statement.setNString(3, producto.getDescripcion());
            statement.setInt(4, producto.getTipo());
            statement.setInt(5, producto.getCantidad());
            statement.setDouble(6, producto.getPrecio());
            statement.setInt(7, producto.getDescuento());
            statement.setInt(8, producto.getIva());
            statement.setBoolean(9, producto.isAplicarDto());

            response = statement.executeUpdate();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return response;
    }
    public int deleteByReference(String referencia){
        int elements = -1;

        String deleteRef = "DELETE FROM producto where referencia = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(deleteRef);) {

            statement.setNString(1, referencia);

            elements = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return elements;
    }

    public List<Producto> getProductos(){

        List<Producto> completa = new LinkedList<>();

        //Setencia SQL
        String getChNames = "SELECT * FROM producto";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
             ResultSet dataSet = statement.executeQuery(getChNames);) {

            while(dataSet.next()){
                int id = dataSet.getInt(1);
                String referencia = dataSet.getString(2);
                String nombre = dataSet.getString(3);
                String descripcion = dataSet.getString(4);
                int tipo = dataSet.getInt(5);
                int cantidad = dataSet.getInt(6);
                double precio = dataSet.getDouble(7);
                int descuento = dataSet.getInt(8);
                int iva = dataSet.getInt(9);
                boolean aplicarDto = dataSet.getBoolean(10);

                Producto c1 =  new Producto(referencia, nombre, descripcion, tipo, cantidad, precio, descuento, iva, aplicarDto);
                completa.add(c1);
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }




        return completa;
    }

}