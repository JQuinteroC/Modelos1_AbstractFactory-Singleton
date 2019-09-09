/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 *
 * @author estudiantes
 */
public class ArmaMago extends ArmaAbstracta {

    @Override
    public String getMensaje() {
        return "Varita de Luz:\n"                    //   
                + "Con esta herramienta un mago es capaz\n"
                + "de concentrar y moldear el maná a su\n"
                + "antojo. los mas grandes hechiceros tienen\n"
                + "varitas capaces de acumular su propio maná\n"
                + "lo que permite obtener mayor poder de\n"
                + "hechizos";
    }
}
