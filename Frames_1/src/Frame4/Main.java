/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame4;

/**
 *
 * @author ADMIN
 */
public class Main {
    
    public static void main(String args[]){
        
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo,vista);
        controlador.Comenzar();
        
    }
    
}
