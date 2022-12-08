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
public class ResponsablesDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public Responsables listarID(String dni){
        Responsables res=new Responsables();
        String sql="select * from compras.responsables where dni=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while(rs.next()){
                res.setNombre(rs.getString(1));
                res.setDni(rs.getString(2));
                
                
            }
        } catch (Exception e) {
        }
        return res;
    }
    
    @Override
    public List listar() {
        List<Responsables> lista=new ArrayList<>();
        String sql="select * from compras.responsables";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Responsables res=new Responsables();
                res.setNombre(rs.getString(1));
                res.setDni(rs.getString(2));
                lista.add(res);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="INSERT INTO compras.responsables(nombre, dni) VALUES(?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            r=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al insertar");
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update compras.responsables set nombre=?,dni=? where dni=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error");
        }
        return r;
    }


    public void eliminardni(String dni) {
        String sql="delete from compras.responsables where dni=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.execute();
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
