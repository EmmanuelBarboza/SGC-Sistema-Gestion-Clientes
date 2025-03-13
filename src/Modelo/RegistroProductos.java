/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class RegistroProductos {

    private ArrayList<Producto> arregloProductos;
    private String mensaje;

    //---------------------------------------------------------------------------------------
    public RegistroProductos() {
        this.arregloProductos = new ArrayList<>();
        this.mensaje = "";
    }//Fin del constructor sin parametro

    //---------------------------------------------------------------------------------------
    public String agregarProducto(Producto producto) {
        if (producto != null) {
            if (buscarIndice(producto.getCodigo()) == -1) {
                arregloProductos.add(producto);
                mensaje = "El producto se agrego correctamente";
            } else {
                mensaje = "El producto con el codigo digitado ya se encuentra registrado previamente";
            }
        } else {
            mensaje = "Error al guardar";
        }

        return mensaje;
    }//Fin del agregarProducto
    //--------------------------------------------------------------------------------------

    public int buscarIndice(String codigo) {
        for (int i = 0; i < arregloProductos.size(); i++) {
            if (arregloProductos.get(i) != null) {
                if (arregloProductos.get(i).getCodigo().equals(codigo)) {
                    return i;
                }
            }
        }
        return -1;
    }//Fin del metodo buscarIndice 
    //---------------------------------------------------------------------------------------

    public Producto buscarProducto(String codigo) {
        int posicion = buscarIndice(codigo);
        if (posicion != -1) {
            return arregloProductos.get(posicion);
        }
        return null;
    }//Fin del buscarProducto

    //---------------------------------------------------------------------------------------
    public String eliminarProducto(String codigo) {
        int posicion = buscarIndice(codigo);
        if (posicion != -1) {
            arregloProductos.remove(posicion);
            mensaje = "El producto fue eliminado correctamente";
        } else {
            mensaje = "No se encuentra ningun producto registrado con el codigo digitado";
        }
        return mensaje;
    }//Fin del eliminarProducto
    //---------------------------------------------------------------------------------------

    public String modificarProducto(Producto producto) {
        int posicion = buscarIndice(producto.getCodigo());
        if (posicion != -1) {
            arregloProductos.get(posicion).setDescripcion(producto.getDescripcion());
            arregloProductos.get(posicion).setPrecio(producto.getPrecio());
            arregloProductos.get(posicion).setCantidad(producto.getCantidad());
            mensaje = "El producto fue modificado correctamente";
        } else {
            mensaje = "No se encuentra ningun producto registrado con el codigo digitado";
        }
        return mensaje;
    }//Fin del modificarProducto

    //----------------------------------------------------------------------------------------
    public String[][] getDatosMatriz() {//para llenar la tabla
        
        
        /////
        //arregloProductos = lectorProductos.leer();//Lena el arreglo con la info que tiene el archivo
        String[][] matrizDatos = new String[arregloProductos.size()][Cliente.TBL__ETIQUETAS.length]; //filas misma cantidad del arreglo

        //la fila es de la misma cantidad del arreglo y las columnas del tbl etiquetas
        for (int i = 0; i < arregloProductos.size(); i++) {
            matrizDatos[i][0] = arregloProductos.get(i).getCodigo();
            matrizDatos[i][1] = arregloProductos.get(i).getDescripcion();
            matrizDatos[i][2] = "" + arregloProductos.get(i).getPrecio();
            matrizDatos[i][3] = "" + arregloProductos.get(i).getCantidad();

           
        }
        return matrizDatos;
    }
//------------------------------------------------------------------------------------------
}//Fin de la clase registroProductos

