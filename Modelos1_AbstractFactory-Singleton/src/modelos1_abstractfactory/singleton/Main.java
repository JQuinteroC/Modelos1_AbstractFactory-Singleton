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
