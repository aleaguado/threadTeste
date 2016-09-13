/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author aleaguado
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversaComUsuario conversacomusuario = new ConversaComUsuario();
        ImprimeNaTela imprimenatela = new ImprimeNaTela();
        
        Thread processoConversa = new Thread(conversacomusuario);
        Thread processoTela = new Thread(imprimenatela);
        
        processoConversa.start();
        processoTela.start();
    }
    
}
