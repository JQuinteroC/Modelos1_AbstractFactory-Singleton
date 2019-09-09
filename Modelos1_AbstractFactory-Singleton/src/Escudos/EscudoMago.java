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
public class EscudoMago extends EscudoAbstracto{
    @Override
    public String getMensaje() {
        return "Poción de escudo:\n"                   // 
                + "Con este artefacto los magos son capaces\n"
                + "de moldear su energia y su maná en\n"
                + "forma de escudo al rededor de su cuerpo.\n"
                + "Estas pociones tienen un efecto de\n"
                + "larga duracion, pero mientras esta activa\n"
                + "el mago pierde algo de potencial al tener\n"
                + "parte de su maná concentrado en modo\n"
                + "escudo";
    } 
}
