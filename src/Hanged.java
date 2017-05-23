/**
 * Created by @lotalorafox on 5/15/2017.
 */

import javax.swing.*;
import java.awt.*;

public class Hanged extends JFrame{
    public Hanged(){
        JPanel man = new Panel();
        man.setPreferredSize(new Dimension(800,1000));
        JPanel kb = new KeyBoard((Panel) man);
        kb.setPreferredSize(new Dimension(200,1000));
        this.add(man, BorderLayout.WEST);
        this.add(kb, BorderLayout.EAST);
    }
    public static void main(String[] args){
        Hanged frame = new Hanged();
        frame.setTitle("Hanged");
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
