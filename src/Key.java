import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by lotalorafox on 5/22/2017.
 */
public class Key extends JButton implements ActionListener{
    char letter;
    Panel p;
    public Key(String s,Panel pp){
        super(s);
        p = pp;
        letter = s.charAt(0);
    }
    public char getLetter(){
        return letter;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.p.review(letter);
    }
}
