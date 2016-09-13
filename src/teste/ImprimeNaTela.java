/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleaguado
 */
public class ImprimeNaTela implements Runnable{
    public void run() {
        while(true){
            System.out.println("To rodanuuuu!!!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImprimeNaTela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
