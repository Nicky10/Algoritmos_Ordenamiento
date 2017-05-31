package Frame2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vista {
    
}
     
     class Ventana extends JFrame{
    public Ventana(){
        
        setTitle("Candado");
    
        setResizable(false);
        setSize(230,130);
        setLocationRelativeTo(null);
        NewClass candado = new NewClass();
        add(candado);
    }
} 
 class NewClass extends JPanel implements ActionListener{
     
    JPanel panelVerde = new JPanel();
    JPanel panelRojo = new JPanel();
    
    JTextField fVerde = new JTextField("1234",20);
    JButton OpenCloseVerde = new JButton("Open/Close");
    JButton bVerde = new JButton("Change Combination");
   
    JTextField fRojo = new JTextField("1234",20);
    JButton OpenCloseRojo = new JButton("Open/Close");
    JButton bRojo = new JButton("Change Combination");
    
    public NewClass(){
         super(new BorderLayout());
        
        fVerde.setPreferredSize(new Dimension(0,30));
        fVerde.addActionListener(this);
        
        OpenCloseVerde.setBorderPainted(false);
        OpenCloseVerde.setOpaque(true);
        OpenCloseVerde.setBackground(Color.green);
        OpenCloseVerde.setPreferredSize(new Dimension(350,30));
        OpenCloseVerde.addActionListener(this);
        
        bVerde.setPreferredSize(new Dimension(300,30));
        bVerde.addActionListener(this);
       
        panelVerde.setBackground(Color.GREEN);
        panelVerde.add(OpenCloseVerde);
        panelVerde.add(fVerde);
        panelVerde.add(bVerde);
        
        
        OpenCloseRojo.setBorderPainted(false);
        OpenCloseRojo.setOpaque(true);
        OpenCloseRojo.setBackground(Color.red);
        OpenCloseRojo.setPreferredSize(new Dimension(350,30)); 
        OpenCloseRojo.addActionListener(this);
        
        fRojo.setPreferredSize(new Dimension(0,30));
        fRojo.addActionListener(this);
        
        bRojo.setPreferredSize(new Dimension(350,30));
        bRojo.addActionListener(this);
       
        panelRojo.setBackground(Color.RED);
        panelRojo.add(OpenCloseRojo);
        panelRojo.add(fRojo);
        panelRojo.add(bRojo); 
        
        add(panelRojo);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object a =e.getSource();
        
        if(a == OpenCloseRojo){
            
            if (fRojo.getText().equals(fVerde.getText())) {
             
                remove(panelRojo);
                add(panelVerde);

            } 
            
        repaint();
        revalidate();  
        } 
        
        if(a == bRojo){
            
            fRojo.setText("Esta cerrado");
        }

        if(a == bVerde){
            
            fVerde.setText("nueva clave:");
            fRojo.setText(fVerde.getText());
            
        }
        
        if(a == OpenCloseVerde){
            
            remove(panelVerde);
            add(panelRojo);
        }
        
        repaint();
        revalidate();  
        
    }
    
     public static void main(String[] args){
        
        Ventana p = new Ventana();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     }
     
 }
