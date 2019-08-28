/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos1_abstractfactory.singleton;

import Fabricas.FabricaElfos;
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
        // Fabrica de Elfos
        FabricaPersonajes FElfos = new FabricaElfos();
        Client c1 = new Client(factory1);
        c1.Run();
        // Fabrica de Enanos
        AbstractFactory factory2 = new ConcreteFactory2();
        Client c2 = new Client(factory2);
        c2.Run();
    }

}
