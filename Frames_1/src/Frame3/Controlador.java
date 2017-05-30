/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ADMIN
 */
public class Controlador implements ActionListener{

        private Modelo modelo;
        private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
                
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        this.modelo.setNombre(this.vista.getNombre().getText());
        this.modelo.setApellido(this.vista.getApellido().getText());
        this.vista.Mensaje(modelo.getNombre(), modelo.getApellido());
                
    }
    
    public void Comenzar(){
        
        this.vista.setVisible(true);
        
    }
    
}

