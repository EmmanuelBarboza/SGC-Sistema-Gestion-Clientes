/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class RegistroClientes {

    private ArrayList<Cliente> arregloClientes;//se declara el arreglo de tipo cliente que se llama arregloClientes
    private String mensaje;
    private String nombreArchivo;
    LectorClientes lectorCliente;
    EscritorCliente escritorCliente;
//------------------------------------------------------------------------------------------      

    public RegistroClientes() {
        this.arregloClientes = new ArrayList<>();
        this.mensaje = "";
        this.nombreArchivo = "archivoClientes.csv";
        this.lectorCliente= new LectorClientes(nombreArchivo);
        this.escritorCliente = new EscritorCliente(nombreArchivo);
    }//Fin del constructor sin parametros
//------------------------------------------------------------------------------------------

    public String agregarCliente(Cliente cliente) {
        if (cliente != null) //no existe
        {
            if (buscarIndice(cliente.getCodigo()) == -1) {
                arregloClientes.add(cliente);
                escritorCliente.escribir(arregloClientes);
                mensaje = "El cliente se agrego correctamente";

            } else {
                mensaje = "El cliente con el codigo digitado se encuentra agregado";

            }
        } else {
            mensaje = "Error al guardar";
        }
        return mensaje;
    }

//
    //------------------------------------------------------------------------------------------
    public int buscarIndice(String codigo) {
        //Se limpia el arreglo haciendo una instancia
        arregloClientes= new ArrayList<>();
        arregloClientes.addAll(lectorCliente.leer());/*Se llena el arreglo con la informacion del archivo
        que devuelve el metodo leer de la clase lector*/
        
        
        
        for (int i = 0; i < arregloClientes.size(); i++) {
            if (arregloClientes.get(i) != null) {
                if (arregloClientes.get(i).getCodigo().equals(codigo)) {
                    return i;
                }
            }
        }

        return -1;

    } //Fin del buscarIndice 
//------------------------------------------------------------------------------------------

    public Cliente buscarCliente(String codigo) {

        int posicion = buscarIndice(codigo);

        if (posicion != -1) {
            return arregloClientes.get(posicion);

        }
        return null;

    }//Fin del buscarCliente

//------------------------------------------------------------------------------------------
    public String eliminarCliente(String codigo) {
        int posicion = buscarIndice(codigo);
        String mensaje = "El cliente se eliminó exitosamente";
        if (posicion != -1) {
            arregloClientes.remove(posicion);
            escritorCliente.escribir(arregloClientes);
        } else {

            mensaje = "No se encuenta ningun cliente registrado con el codigo digitado ";

        }
        return mensaje;

    }
//------------------------------------------------------------------------------------------

    public String modificarCliente(Cliente cliente) {
        int posicion = buscarIndice(cliente.getCodigo());
        if (posicion != -1) {
            arregloClientes.get(posicion).setNombre(cliente.getNombre());
            arregloClientes.get(posicion).setCiudad(cliente.getCiudad());
            arregloClientes.get(posicion).setEdad(cliente.getEdad());
            arregloClientes.get(posicion).setTelefono(cliente.getTelefono());
            escritorCliente.escribir(arregloClientes);
        } else {
            mensaje = "No se encuenta ningun cliente registrado con el codigo digitado ";
        }
        return mensaje;

    }
//------------------------------------------------------------------------------------------

    public String mostrarLista(Cliente cliente) {

        for (int i = 0; i < arregloClientes.size(); i++) {

            if (arregloClientes.get(i) != null) {

                mensaje += cliente.toString() + "\n";
            }
        }
        return mensaje;

    }

    public String[][] getDatosMatriz() {//para llenar la tabla
        arregloClientes=lectorCliente.leer();//Lena el arreglo con la info que tiene el archivo
        String[][] matrizDatos = new String[arregloClientes.size()][Cliente.TBL__ETIQUETAS.length]; //filas misma cantidad del arreglo

        //la fila es de la misma cantidad del arreglo y las columnas del tbl etiquetas
        for (int i = 0; i < arregloClientes.size(); i++) {
            matrizDatos[i][0] = arregloClientes.get(i).getCodigo();
            matrizDatos[i][1] = arregloClientes.get(i).getNombre();
            matrizDatos[i][2] = arregloClientes.get(i).getCiudad();
            matrizDatos[i][3] = "" + arregloClientes.get(i).getEdad();
            matrizDatos[i][4] = "" + arregloClientes.get(i).getTelefono();

            //edad y telefono se parsea o concatena porque la tabla recibe string
            // matiz datos en la posicion i columna 0 guarda lo que tiene tiene el arreglo (los atributos, codigo nombre etc)
        }
        return matrizDatos;

    }

}//Fin de la clase RegistroClientes
