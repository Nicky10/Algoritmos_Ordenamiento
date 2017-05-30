/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame3;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Vista extends JFrame{
    
    public JLabel label1,label2,label3;
    public JButton boton;
    public JTextField nombre,apellido;
    public Controlador controlador;
    
    public Vista(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,1200);
        setTitle("TextFieldTest");
        setLayout(new GridLayout(6,1));
        this.label1 = new JLabel("        Digite su nombre");
        this.nombre = new JTextField(10);
        this.label2 = new JLabel("        Digite su apellido");
        this.apellido = new JTextField(10);
        this.boton = new JButton("Hecho");
        
        add(label1);
        add(nombre);
        add(label2);
        add(apellido);
        add(boton);
        
        
        pack();
        
    }
        public void setControlador(Controlador controlador){
            
            this.controlador = controlador;
            this.boton.addActionListener(this.controlador);
            
        }
        
        public void Mensaje(String a,String b){
            
                    
                    this.label3 = new JLabel("Hola "+a + " " + b + ".");
                    add(label3);
                   
            
        }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    public JTextField getApellido() {
        return apellido;
    }

    public void setApellido(JTextField apellido) {
        this.apellido = apellido;
    }
        
        
        
    }
    

