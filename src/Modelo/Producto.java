/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mtdq1
 */
public class Producto {

    public String codigo;
    public String descripcion;
    public int precio;
    public int cantidad;
    public static final String []TBL__ETIQUETAS ={"Codigo","Descripcion","Precio","Cantidad"};
            //vector de etiquetas que recibe el panel

    public Producto() {// sin parametros se inicializan
        this.codigo = "";
        this.descripcion = "";
        this.precio = 0;
        this.cantidad = 0;

    }
    public Producto(String codigo, String descripcion, int precio, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return """
               Producto
               Codigo:""" + codigo + "\nDescripcion=" + descripcion + "\nPrecio=" + precio + "\nCantidad=" + cantidad;
    }
    
}
