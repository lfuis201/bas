/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.*;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conexion {
    Connection con;
    String url="jdbc:postgresql://localhost:5432/retailaqp";
    String user="postgres";
    String pass="gatita";
    public  Connection Conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("no hay conexion");
        }
        return con;
    }
}
