package teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author aleaguado
 */
public class ConversaComUsuario implements Runnable{
     public void run () {
        Scanner ler = new Scanner(System.in);
        while(true){
            System.out.println("Digite algo colega!!!");
            System.out.println("Digitado: " + ler.next());
        }   
     }
}
