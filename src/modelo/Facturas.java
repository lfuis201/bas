/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nuez_
 */
public class Facturas {
    int id;
    int id_item;
    String fecha;
    String proveedor;
    int total_bienes;
    double vslor_totsl;
    int num_entrada;

    public Facturas() {
    }

    public Facturas(int id, int id_item, String fecha, String proveedor, int total_bienes, double vslor_totsl, int num_entrada) {
        this.id = id;
        this.id_item = id_item;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.total_bienes = total_bienes;
        this.vslor_totsl = vslor_totsl;
        this.num_entrada = num_entrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getTotal_bienes() {
        return total_bienes;
    }

    public void setTotal_bienes(int total_bienes) {
        this.total_bienes = total_bienes;
    }

    public double getVslor_totsl() {
        return vslor_totsl;
    }

    public void setVslor_totsl(double vslor_totsl) {
        this.vslor_totsl = vslor_totsl;
    }

    public int getNum_entrada() {
        return num_entrada;
    }

    public void setNum_entrada(int num_entrada) {
        this.num_entrada = num_entrada;
    }
    
    
}
