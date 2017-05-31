/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame1;

import java.awt.*;
import javax.swing.*;


public class NewClass {
    
    public static void main(String [] args){
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(360,230));
        frame.setTitle("Calcuator");
        frame.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JTextField(25));
        frame.add(panel,BorderLayout.NORTH);
        
        FlowLayout fl1 = new FlowLayout();  
        fl1.setVgap(5);
        JPanel panel2 = new JPanel(fl1);
        panel2.add(new JButton("BackSpace")).setForeground(Color.red);
        panel2.add(new JButton("      CE       ")).setForeground(Color.red);
        panel2.add(new JButton("       C       ")).setForeground(Color.red);
        frame.add(panel2,BorderLayout.AFTER_LINE_ENDS);
        
        
//        GridLayout gl1 = new GridLayout(4,1);  
//        gl1.setVgap(5);
//        JPanel panel4 = new JPanel(gl1);
        
        GridLayout gl = new GridLayout(4,6);  
        gl.setHgap(5);
        gl.setVgap(5);
        JPanel panel3 = new JPanel(gl);
        panel3.add(new JButton("MC")).setForeground(Color.red);
        panel3.add(new JButton("7"));
        panel3.add(new JButton("8"));
        panel3.add(new JButton("9"));
        panel3.add(new JButton("/")).setForeground(Color.red);
        panel3.add(new JButton("sqrt"));
        panel3.add(new JButton("MR")).setForeground(Color.red);
        panel3.add(new JButton("4"));
        panel3.add(new JButton("5"));
        panel3.add(new JButton("6"));
        panel3.add(new JButton("*")).setForeground(Color.red);
        panel3.add(new JButton("%"));
        panel3.add(new JButton("MS")).setForeground(Color.red);
        panel3.add(new JButton("1"));
        panel3.add(new JButton("2"));
        panel3.add(new JButton("3"));
        panel3.add(new JButton("-")).setForeground(Color.red);
        panel3.add(new JButton("1/x"));
        panel3.add(new JButton("M+")).setForeground(Color.red);
        panel3.add(new JButton("0"));
        panel3.add(new JButton("+/-"));
        panel3.add(new JButton("."));
        panel3.add(new JButton("+")).setForeground(Color.red);
        panel3.add(new JButton("=")).setForeground(Color.red);
        frame.add(panel3,BorderLayout.SOUTH);
        
        
        frame.setVisible(true);
        
    }
    
}
