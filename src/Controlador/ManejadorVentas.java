/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.RegistroClientes;
import Vista.FRM_Ventas;
import Vista.PanelDatosCliente_Venta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mtdq1
 */
public class ManejadorVentas implements ActionListener {

    FRM_Ventas frmVentas;
    Cliente cliente;
    RegistroClientes registroClientes;
    PanelDatosCliente_Venta panelClientes;

    public ManejadorVentas(PanelDatosCliente_Venta panelClientes, FRM_Ventas frmVentas) 
    {
        
        this.frmVentas= frmVentas;
        
       
        this.panelClientes = panelClientes;
        this.cliente= cliente;
        
         registroClientes = new RegistroClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Buscar Cliente"))
        {
            
            
              //Verificar que el txt este lleno
            if (panelClientes.getTxtCodigoVenta().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar el codigo");

            } else {
                cliente = registroClientes.buscarCliente(panelClientes.getTxtCodigoVenta());

                if (cliente != null) 
                {
                    panelClientes.setTxtNombreCliente(cliente.getNombre());
                   
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "El cliente que busca no se encuentra");

                }
            }
            
        
        }
        if(e.getActionCommand().equals("Salir"))
        {
           frmVentas.dispose();
        
        
        }
                
        
        
    }

}
