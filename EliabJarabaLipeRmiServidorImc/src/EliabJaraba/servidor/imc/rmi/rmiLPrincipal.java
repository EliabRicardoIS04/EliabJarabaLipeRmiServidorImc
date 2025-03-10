
package EliabJaraba.servidor.imc.rmi;

import EliabJaraba.servidor.imc.rmi.net.Servidor;


public class rmiLPrincipal {

 
    public static void main(String[] args) {
       Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
}
