/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escudos;

/**
 *
 * @author estudiantes
 */
public class EscudoElfo extends EscudoAbstracto {

    @Override
    public String getMensaje() {
        return "Escudo Elfico:\n"                    //   
                + "No es un escudo comun y corriente, a\n"
                + "pesar de su pequeño tamaño, esta hecho\n"
                + "de la madera del arbol padre, ubicado\n"
                + "en en centro de la aldea elfica.\n"
                + "esta es la madera mas resistente de toda\n"
                + "la tierra media";
    }
}
