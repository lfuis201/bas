/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalbasededatos2;

import modelo.Conexion;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ExamenFinalBasedeDatos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.Conectar();
    }
    
}
