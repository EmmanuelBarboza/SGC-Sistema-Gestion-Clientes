/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Estudiante
 */
public class LectorClientes {

    public String nombreArchivo;
    ArrayList<Cliente> arregloClientes;

    public LectorClientes(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

    }//Fin del constructor
//---------------------------------------------------------  

    public ArrayList<Cliente> leer() {
        try {
            CSVReader csvReader = null;
            List<String[]> arregloVectores = null;
            arregloClientes = new ArrayList<>();
            
            csvReader = new CSVReader(new FileReader(nombreArchivo));
            arregloVectores = csvReader.readAll();

            for (String[] linea : arregloVectores) {
                Cliente cliente = new Cliente(linea[0], linea[1], linea[2], Integer.parseInt(linea[3]), Integer.parseInt(linea[4]));
                arregloClientes.add(cliente);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException io) {
            io.printStackTrace();

        }
        return arregloClientes;
    }

}
