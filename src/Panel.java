/**
 * Created by lotalorafox on 5/15/2017.
 */
import org.w3c.dom.events.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.logging.*;
import java.util.Scanner;



public class Panel extends JPanel implements ActionListener,MouseListener{
    private Timer timer;
    private Word w = new Word();
    private Person p = new Person();
    private int h = 0;
    private char[] letters;
    private int lb=0;
    private int lx =400;
    private int ly =600;

    public Panel(){
        w.selectnumber();
        letters = new char[w.getNlenght()];
        addKeyListener(new TAdapter());
        setFocusable(true);
        timer = new Timer(25, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int l=0;
        for (int i=0;i<w.getNlenght();i++){
            int xi = 400+l;
            int yi =600;
            int xf = xi+40;
            int yf = yi;
            g.drawLine(xi,yi,xf,yf);
            l+=50;
        }
        p.draw(g,h);
        this.drawletter(g);
        if(h==8){
            this.drawworddead(g);
        }



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }
    public void drawletter(Graphics d) {
        if(lb !=w.getNlenght()){
            for (int m = 0; m < w.getNlenght(); m++) {
                for (int n = 0; n < lb; n++) {
                    if (letters[n] == w.getword().charAt(m)) {
                        String tem = Character.toString(letters[n]);
                        Font f = new Font("Serif", Font.BOLD, 30);
                        d.setFont(f);
                        int x = lx + m * 50;
                        int y = ly;
                        d.drawString(tem, x, y);
                    }
                }

            }
        }else{
            for (int m = 0; m < w.getNlenght(); m++) {
                for (int n = 0; n < lb; n++) {
                    if (letters[n] == w.getword().charAt(m)) {
                        String tem = Character.toString(letters[n]);
                        Font f = new Font("Serif", Font.BOLD, 30);
                        d.setFont(f);
                        int x = lx + m * 50;
                        int y = ly;
                        d.drawString(tem, x, y);
                    }
                }
            }
            d.setColor(Color.yellow);
            Font f = new Font("Serif",Font.BOLD,140);
            d.setFont(f);
            d.drawString("You win!!! :3",100,500);
        }
    }
    private void drawworddead(Graphics d){
        for (int i=0;i<w.getword().length();i++){
            String tem = Character.toString(w.getword().charAt(i));
            Font f = new Font("Serif", Font.BOLD, 30);
            d.setFont(f);
            int x = lx + i * 50;
            int y = ly;
            d.drawString(tem, x, y);
        }
    }

    private class TAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {

            int l =0;
            int key = e.getKeyCode();
            char k = e.getKeyChar();
            for (int i=0;i<w.getword().length();i++){
                if (k == w.getword().charAt(i)){
                    l++;
                    letters[lb] = w.getword().charAt(i);
                    lb++;
                }
            }
            if(l == 0){
                h++;
                l=0;
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}

