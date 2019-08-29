package modelos1_abstractfactory.singleton;

import Armas.ArmaAbstracta;
import Cuerpos.CuerpoAbstracto;
import Escudos.EscudoAbstracto;
import Fabricas.FabricaElfos;
import Fabricas.FabricaMagos;
import Fabricas.FabricaPersonajes;
import Ventanas.FRM_Principal;


public class Main {

    public static void main(String[] args) {
        ArmaAbstracta Arma;
        CuerpoAbstracto Cuerpo;
        EscudoAbstracto Escudo;
        
        // Fabrica de Elfos
        System.out.println("Fabrica de Elfos");
        FabricaPersonajes Fabrica = new FabricaElfos();
        Arma = Fabrica.CrearArma();
        Cuerpo = Fabrica.CrearCuerpo();
        Escudo = Fabrica.CrearEscudo();
        System.out.println("Cuerpo: "+Cuerpo.getMensaje()+"\nArma: "+Arma.getMensaje()+"\nEscudo:"+Escudo.getMensaje());
        System.out.println();
        
        // Fabrica de Enanos
        System.out.println("Fabrica de Magos");
        Fabrica = new FabricaMagos();
        Arma = Fabrica.CrearArma();
        Cuerpo = Fabrica.CrearCuerpo();
        Escudo = Fabrica.CrearEscudo();
        System.out.println("Cuerpo: "+Cuerpo.getMensaje()+"\nArma: "+Arma.getMensaje()+"\nEscudo:"+Escudo.getMensaje());
        
        // <editor-fold defaultstate="collapsed" desc="Mostrar ventana principal">
        FRM_Principal ventana = FRM_Principal.getInstance();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        ventana.setVisible(true);
        //</editor-fold>
    }

}
