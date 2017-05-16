import javax.swing.*;
import java.awt.*;
import java.awt.font.*;

/**
 * Created by lotalorafox on 5/15/2017.
 */
public class Person extends JPanel {
    public void draw(Graphics h,int n){
        switch (n){
            case 1:
                tree(h);
                break;
            case 2:
                tree(h);
                head(h);
                break;
            case 3:
                tree(h);
                head(h);
                body(h);
                break;
            case 4:
                tree(h);
                head(h);
                body(h);
                arm1(h);
                break;
            case 5:
                tree(h);
                head(h);
                body(h);
                arm1(h);
                arm2(h);
                break;
            case 6:
                tree(h);
                head(h);
                body(h);
                arm1(h);
                arm2(h);
                leg1(h);
                break;
            case 7:
                tree(h);
                head(h);
                body(h);
                arm1(h);
                arm2(h);
                leg1(h);
                leg2(h);
                break;
            case 8:
                tree(h);
                head(h);
                body(h);
                arm1(h);
                arm2(h);
                leg1(h);
                leg2(h);
                dead(h);
                break;
        }

    }
    public void tree(Graphics t){
        t.drawLine(700,500,700,100);
        t.drawLine(700,100,400,100);
    }
    public void head(Graphics h){
        h.drawOval(350,100,100,100);
    }
    public void body(Graphics b){
        b.drawLine(400,200,400,400);
    }
    public void arm1(Graphics a1){
        a1.drawLine(400,200,300,300);
    }
    public void arm2(Graphics a2){
        a2.drawLine(400,200,500,300);
    }
    public void leg1(Graphics l1){
        l1.drawLine(400,400,300,500);
    }
    public void leg2(Graphics l2){
        l2.drawLine(400,400,500,500);
    }
    public void dead(Graphics d){
        d.setColor(Color.red);
        Font f = new Font("Serif",Font.BOLD,140);
        d.setFont(f);
        d.drawString("You are dead",100,500);
    }
}
