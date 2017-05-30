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
public class NewClass extends JFrame implements ActionListener{

    public JLabel titulo,interes,años,loan,mensual,total;
    public JTextField Tinteres,Taños,Tloan,Tmensual,Ttotal;
    public JButton boton;
    public GridLayout Grid = new GridLayout(5,2);
    public FlowLayout Flow = new FlowLayout();
    
    
    public NewClass(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,1200);
        setTitle("LoanCalculator");
        setLayout(Grid);
        this.titulo = new JLabel("Enter loan amount, interest rate, and years");
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
        add(interes);
        add(años);
        add(loan);
        add(mensual);
        add(total);
        add(Tinteres);
        add(Taños);        
        add(Tloan);
        add(Tmensual);
        add(Ttotal);
        
        setLayout(Flow);
        this.boton = new JButton("Compute Payment");
        
        add(boton);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String a=Taños.getText();
        int años=Integer.parseInt(a);
        String i=Tinteres.getText();
        double interes=Integer.getInteger(i);
        String l=Tloan.getText();
        double loan=Integer.getInteger(l);
        
        double mensual = loan*(interes/12);
        Tmensual.setText(""+mensual);
        double total = loan+(años*(mensual*12));
        Ttotal.setText(""+total);
        repaint();
        
        
        }

    public NewClass(JTextField Tinteres, JTextField Taños, JTextField Tloan, JTextField Tmensual, JTextField Ttotal) {
        this.Tinteres = Tinteres;
        this.Taños = Taños;
        this.Tloan = Tloan;
        this.Tmensual = Tmensual;
        this.Ttotal = Ttotal;
        this.boton.addActionListener(this);
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
