/**
 * Created by lotalorafox on 5/22/2017.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyBoard extends JPanel {
    Panel p;
    public KeyBoard(Panel pc){
        p = pc;
        for (int i=97;i<=122;i++){
            String s =Character.toString((char)i);
            Key k = new Key(s,p);
            k.addActionListener(k);
            add(k);
        }


    }
}
