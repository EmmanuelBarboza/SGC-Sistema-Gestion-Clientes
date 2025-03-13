/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Modelo.RegistroProductos;
import Vista.FRM_RegistroProductos;
import Vista.PanelBotones;
import Vista.PanelDatosProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mtdq1
 */
public class ManejadorRegistroProductos implements ActionListener {

    PanelBotones panelBotones;
    PanelDatosProductos panelDatosProductos;
    FRM_RegistroProductos frmRegistro;
    RegistroProductos registro;
    Producto producto;

    //una vez hecha las instancias click derecho insert code contructor todos excepto producto
    public ManejadorRegistroProductos(PanelBotones panelBotones, PanelDatosProductos panelDatosProductos, FRM_RegistroProductos frmRegistro) {
        this.panelBotones = panelBotones;
        this.panelDatosProductos = panelDatosProductos;
        this.frmRegistro = frmRegistro;
        //este ultimo se cambia y se pone = new
        registro = new RegistroProductos();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Agregar")) {

            if (panelDatosProductos.getTxtCodigo().isEmpty() || panelDatosProductos.getTxtDescripcion().isEmpty() || panelDatosProductos.getTxtPrecio().isEmpty() || panelDatosProductos.getSpCantidad().equals("0")) {

                JOptionPane.showMessageDialog(null, "Por favor ingresar todos los datos");

            } else {
                producto = new Producto(panelDatosProductos.getTxtCodigo(), panelDatosProductos.getTxtDescripcion(), Integer.parseInt(panelDatosProductos.getTxtPrecio()), Integer.parseInt(panelDatosProductos.getSpCantidad()));

                JOptionPane.showMessageDialog(null, registro.agregarProducto(producto));
                panelDatosProductos.limpiar();
            }

        }
        //---------------------------------------------------------------------------
        if (e.getActionCommand().equals("Buscar")) {

            if (panelDatosProductos.getTxtCodigo().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar el codigo del producto");

            } else {
                producto = registro.buscarProducto(panelDatosProductos.getTxtCodigo());
                if (producto != null) {
                    panelDatosProductos.setTxtDescripcion(producto.getDescripcion());
                    panelDatosProductos.setTxtPrecio("" + producto.getPrecio());
                    panelDatosProductos.setSpCantidad("" + producto.getCantidad());
                    panelBotones.enableBotones(true);
                } else {
                    JOptionPane.showMessageDialog(null, "El producto que se busca no se encuentra registrado");
                }
            }
        }
        //---------------------------------------------------------------------------
        if (e.getActionCommand().equals("Modificar")) {
            if (panelDatosProductos.getTxtCodigo().isEmpty() || panelDatosProductos.getTxtDescripcion().isEmpty() || panelDatosProductos.getTxtPrecio().isEmpty() || panelDatosProductos.getSpCantidad().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Por favor ingresar todos los datos");

            } else {
                producto = new Producto(panelDatosProductos.getTxtCodigo(), panelDatosProductos.getTxtDescripcion(), Integer.parseInt(panelDatosProductos.getTxtPrecio()), Integer.parseInt(panelDatosProductos.getSpCantidad()));

                JOptionPane.showMessageDialog(null, registro.modificarProducto(producto));
                panelDatosProductos.limpiar();
                panelBotones.enableBotones(false);
            }
        }
        //---------------------------------------------------------------------------
        if (e.getActionCommand().equals("Eliminar")) {
            if (panelDatosProductos.getTxtCodigo().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresar el codigo del producto");
            } else {
                JOptionPane.showMessageDialog(null, registro.eliminarProducto(panelDatosProductos.getTxtCodigo()));
                panelDatosProductos.limpiar();
                panelBotones.enableBotones(false);

            }
        }
        //---------------------------------------------------------------------------
//        if (e.getActionCommand().equals("Lista")) {
//            if ("".equals(registro.imprimirLista())) {
//                JOptionPane.showMessageDialog(null, "No hay ningun producto registrado, favor registrar alguno");
//            } else {
//                JOptionPane.showMessageDialog(null, registro.imprimirLista());
//            }
//        }
        //---------------------------------------------------------------------------
        if (e.getActionCommand().equals("Salir")) {
            frmRegistro.dispose();//Cierra la ventana de RegistroProducto
        }
        //---------------------------------------------------------------------------

    }//Fin del actionPerformed

}//Fin de la c lase


