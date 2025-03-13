/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FRM_ConsultarFactura;
import Vista.FRM_RegistroProductos;
import Vista.FRM_RegistroClientes;
import Vista.FRM_Ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiante
 */
public class Manejador implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Salir")) {
            System.exit(0);
        }
        if (e.getActionCommand().equals("Registrar Cliente")) {

            new FRM_RegistroClientes().setVisible(true);

        }
        if (e.getActionCommand().equals("Registrar Productos")) {
            new FRM_RegistroProductos().setVisible(true);

        }
        if (e.getActionCommand().equals("Modulo de Venta")) {
            new FRM_Ventas().setVisible(true);

        }
         if (e.getActionCommand().equals("Consultar Factura")) {
            new FRM_ConsultarFactura().setVisible(true);

        }

    }//Fin del actionPerformed

}//Fin de la clase Manejador
