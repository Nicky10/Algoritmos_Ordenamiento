/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame4;

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
        
        String a=vista.Taños.getText();
        int años=Integer.parseInt(a);
        String i=vista.Tinteres.getText();
        double interes=Double.parseDouble(i);
        String l=vista.Tloan.getText();
        double loan=Double.parseDouble(l);
        
        double mensual = loan*(interes/12);
        vista.Tmensual.setText(""+mensual);
        double total = loan+(años*(mensual*12));
        vista.Ttotal.setText(""+total);
        
        
        }
    
    
    public void Comenzar(){
        
        this.vista.setVisible(true);
        
    }
    
}
