/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal.IU;

/**
 *
 * @author dayan
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IUPrincipal principal = new IUPrincipal();
        principal.setVisible(true);
        principal.setTitle("Sistema de Universidade");
        principal.toFront();
    }
    
}
