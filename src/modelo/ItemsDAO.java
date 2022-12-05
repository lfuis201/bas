 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ItemsDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Items listarID(String dni){
        Items item=new Items();
        String sql="select * from compras.items where id_item=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while(rs.next()){
                item.setId(rs.getInt(1));
                item.setNombre(rs.getString(2));
                item.setCantidad(rs.getInt(3));
                item.setUnidad_medida(rs.getString(4));
                item.setValor_unitario(rs.getDouble(5));
                item.setValor_total(rs.getDouble(6));
                
            }
        } catch (Exception e) {
        }
        return item;
    }
    
    @Override
    public List listar() {
        List<Items> lista=new ArrayList<>();
        String sql="select * from compras.items";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Items item=new Items();
                item.setId(rs.getInt(1));
                item.setNombre(rs.getString(2));
                item.setCantidad(rs.getInt(3));
                item.setUnidad_medida(rs.getString(4));
                item.setValor_unitario(rs.getDouble(5));
                item.setValor_total(rs.getDouble(6));
                lista.add(item);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="INSERT INTO compras.ITEMS(nombre_items,cantidad,unidad_medida,valor_unitario,valor_total) VALUES(?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update compras.items set nombre_items=?,cantidad=?,unidad_medida=?,valor_unitario=?,valor_total=? where id_items=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql="delete from compras.items where id_items=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
        }
    }
}
