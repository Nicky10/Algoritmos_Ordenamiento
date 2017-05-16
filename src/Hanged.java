/**
 * Created by @lotalorafox on 5/15/2017.
 */

import javax.swing.*;
import java.awt.Graphics;

public class Hanged extends JFrame{
    public Hanged(){
        add(new Panel());
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
