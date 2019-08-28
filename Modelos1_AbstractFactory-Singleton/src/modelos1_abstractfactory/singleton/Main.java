/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos1_abstractfactory.singleton;

import Armas.ArmaAbstracta;
import Cuerpos.CuerpoAbstracto;
import Escudos.EscudoAbstracto;
import Fabricas.FabricaElfos;
import Fabricas.FabricaMagos;
import Fabricas.FabricaPersonajes;

/**
 *
 * @author estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
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
    }

}
