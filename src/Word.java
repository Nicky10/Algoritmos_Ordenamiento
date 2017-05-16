/**
 * Created by lotalorafox on 5/15/2017.
 */
import java.math.*;
public class Word {
    private String[] words = {"baby","number","fish","music","opinion","station","orange"};
    private int ns;
    public void Word(){

    }
    public void selectnumber(){
        ns = (int )(Math.random() * words.length-1 );
    }
    public int getNlenght(){
        return words[ns].length();
    }
    public  String getword(){
        return words[ns];
    }

}
