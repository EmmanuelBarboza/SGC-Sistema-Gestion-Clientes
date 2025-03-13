/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.RegistroClientes;
import Vista.FRM_RegistroClientes;
import Vista.FRM_ReporteClientes;
import Vista.PanelBotones;
import Vista.PanelDatosCliente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ManejadorRegistroClientes implements ActionListener {

    PanelBotones panelBotones;
    PanelDatosCliente panelDatos;
    FRM_RegistroClientes frmRegistro;
    RegistroClientes registro;
    Cliente cliente;

    FRM_ReporteClientes frmReporte;

    public ManejadorRegistroClientes(PanelBotones panelBotones, PanelDatosCliente panelDatos, FRM_RegistroClientes frmRegistro) {
        this.panelBotones = panelBotones;
        this.panelDatos = panelDatos;
        this.frmRegistro = frmRegistro;
        registro = new RegistroClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Agregar")) {
            //Verificar que todos los campos esten llenos

            if (panelDatos.getTxtCodigo().isEmpty() || panelDatos.getTxtNombre().isEmpty() || panelDatos.getTxtCiudad().isEmpty() || panelDatos.getTxtEdad().isEmpty() || panelDatos.getTxtTelefono().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar todos los datos");

            } else {
                try {
                    //Se parsea primero
                    int edad = Integer.parseInt(panelDatos.getTxtEdad());
                    int telefono = Integer.parseInt(panelDatos.getTxtTelefono());

                    cliente = new Cliente(panelDatos.getTxtCodigo(), panelDatos.getTxtNombre(), panelDatos.getTxtCiudad(), edad, telefono);
                    
                    JOptionPane.showMessageDialog(panelBotones, registro.agregarCliente(cliente));

                    panelDatos.limpiar();
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresar solo numeros");
                }

            }

        }
        //---
        if (e.getActionCommand().equals("Buscar")) {

            //Verificar que el codigo este lleno
            if (panelDatos.getTxtCodigo().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar en codigo");

            } else {
                cliente = registro.buscarCliente(panelDatos.getTxtCodigo());

                if (cliente != null) {
                    panelDatos.setTxtNombre(cliente.getNombre());
                    panelDatos.setTxtCiudad(cliente.getCiudad());
                    panelDatos.setTxtEdad("" + cliente.getEdad());//se parsea a String
                    panelDatos.setTxtTelefono("" + cliente.getTelefono());//se parsea a String

                    panelBotones.enableBotones(true);

                } else {
                    JOptionPane.showMessageDialog(null, "El cliente que busca no se encuentra");

                }
            }

        }
        //---
        if (e.getActionCommand().equals("Eliminar")) {
            // Verificar que el codigo este lleno

            if (panelDatos.getTxtCodigo().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese el codigo");

                panelBotones.enableBotones(false);

            } else {

                JOptionPane.showMessageDialog(null, registro.eliminarCliente(panelDatos.getTxtCodigo()));
                panelDatos.limpiar();
            }

        }

        if (e.getActionCommand().equals("Modificar")) {

            //Verificar que todos los campos esten llenos
            if (panelDatos.getTxtNombre().isEmpty() || panelDatos.getTxtCiudad().isEmpty() || panelDatos.getTxtCiudad().isEmpty() || panelDatos.getTxtTelefono().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar todos los datos");

                panelBotones.enableBotones(false);

            } else {
                cliente = new Cliente(panelDatos.getTxtCodigo(), panelDatos.getTxtNombre(), panelDatos.getTxtCiudad(), Integer.parseInt(panelDatos.getTxtEdad()), Integer.parseInt(panelDatos.getTxtEdad()));
                JOptionPane.showMessageDialog(panelBotones, registro.agregarCliente(cliente));

                panelDatos.limpiar();

            }

        }
        //---
        if (e.getActionCommand().equals("Lista")) {
            frmReporte = new FRM_ReporteClientes();
            frmReporte.setVisible(true);
            frmReporte.setDatosTabla(registro.getDatosMatriz(), Cliente.TBL__ETIQUETAS);

        }
        //---
        if (e.getActionCommand().equals("Salir")) {
            frmRegistro.dispose();//Cierra la ventana de registro cliente

        }

    }

}//Fin de la clase
