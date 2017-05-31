/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame4;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Vista extends JFrame{

    public JLabel titulo,interes,años,loan,mensual,total,punto;
    public JTextField Tinteres,Taños,Tloan,Tmensual,Ttotal;
    public JButton boton;
    public GridLayout Grid = new GridLayout(7,2);
    public FlowLayout Flow = new FlowLayout();
    public Controlador controlador;
    
    
    public Vista(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,1200);
        setTitle("LoanCalculator");
        setLayout(Grid);
        this.titulo = new JLabel("       Enter loan amount, interest rate, and years");
        this.punto = new JLabel("");
        this.interes = new JLabel("Annual Interest Rate");
        this.años = new JLabel("Number of years");
        this.loan = new JLabel("Loan Amount");
        this.mensual = new JLabel("Monthly Paymenth");
        this.total = new JLabel("Total Payment");
        this.Taños = new JTextField(10);
        this.Tloan = new JTextField(10);
        this.Tinteres = new JTextField(10);
        this.Tmensual = new JTextField(10);
        this.Ttotal = new JTextField(10);
        
        add(titulo);
        add(punto);
        add(interes);
        add(Tinteres);
        add(años);
        add(Taños);
        add(loan);        
        add(Tloan);
        add(mensual);
        add(Tmensual);
        add(total);
        add(Ttotal);
        
        this.boton = new JButton("Compute Payment");
        add(boton);
        pack();
        
    }    
    
    public void setControlador(Controlador controlador){
            
            this.controlador = controlador;
            this.boton.addActionListener(this.controlador);
            
        }

    public JTextField getTinteres() {
        return Tinteres;
    }

    public void setTinteres(JTextField Tinteres) {
        this.Tinteres = Tinteres;
    }

    public JTextField getTaños() {
        return Taños;
    }

    public void setTaños(JTextField Taños) {
        this.Taños = Taños;
    }

    public JTextField getTloan() {
        return Tloan;
    }

    public void setTloan(JTextField Tloan) {
        this.Tloan = Tloan;
    }

    public JTextField getTmensual() {
        return Tmensual;
    }

    public void setTmensual(JTextField Tmensual) {
        this.Tmensual = Tmensual;
    }

    public JTextField getTtotal() {
        return Ttotal;
    }

    public void setTtotal(JTextField Ttotal) {
        this.Ttotal = Ttotal;
    }
    
    
}
