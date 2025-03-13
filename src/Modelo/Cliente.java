/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Cliente {
    private String codigo; 
    private String nombre;
    private String ciudad;
    private int edad;
    private int telefono;
    public static final String []TBL__ETIQUETAS ={"Codigo","Nombre","Ciudad","Edad", "Telefono"};
            //vector de etiquetas que recibe el panel

    public Cliente(String codigo, String nombre, String ciudad, int edad, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
        this.telefono = telefono;
    }
    public Cliente() //constructor sin parametros para asignarle valores directamente
    {
        this.codigo = "";
        this.nombre = "";
        this.ciudad = "";
        this.edad = 0;
        this.telefono = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente\nCodigo=" + codigo + "\nNombre=" + nombre + "\nCiudad=" + ciudad + "\nEdad=" + edad + "\nTelefono=" + telefono;
    }
     
}//Fin de la clase cliente
