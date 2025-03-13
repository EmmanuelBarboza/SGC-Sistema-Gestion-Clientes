/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class EscritorCliente {

    private String nombreArchivo;//Definir la variable donde va a guardar la ubicacion del archivo

    public EscritorCliente(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

    }//Constructor con paramentros
/*Recibe un arreglo de clientes y lo pasa a un arreglo de vectores donde cada posicion del vector
   guarda un atributo del cliente*/
    public List procesarClientes(ArrayList<Cliente> arregloClientes) {
        List<String[]> arregloVectores = new ArrayList<>();
        for (Cliente cliente : arregloClientes) {   //con el mismo orden de parametros del constructor del objeto
            arregloVectores.add(new String[]{cliente.getCodigo(), cliente.getNombre(), cliente.getCiudad(), cliente.getEdad() + "", cliente.getTelefono() + ""});

        }
        return arregloVectores;//retorna el vector

    }
    
//************************************************************************    
/*Este metodo recibe el arreglo de clientes, se crea el canal o flujo para escribir en
  el archivos (CSWriter), se escribe en el archivo todo mediante3 el writeAll, llamando al 
    metodo procesar que devuelvge el arreglo de vectores
    */
    public void escribir(ArrayList<Cliente> clientes) {
        try {
            CSVWriter csvOutput
                    = new CSVWriter(new FileWriter(nombreArchivo, false));
            csvOutput.writeAll(procesarClientes(clientes));//Esta escribiendo el arreglo de vectores en el archivo documento
            csvOutput.close();

        } catch (IOException io) {
            io.printStackTrace();

        }

    }
}//Fin de la clases
