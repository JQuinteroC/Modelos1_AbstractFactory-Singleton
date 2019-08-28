/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armas.ArmaAbstracta;
import Armas.ArmaElfo;
import Cuerpos.CuerpoAbstracto;
import Cuerpos.CuerpoElfo;
import Escudos.EscudoAbstracto;
import Escudos.EscudoElfo;

/**
 *
 * @author estudiantes
 */
public class FabricaElfos extends FabricaPersonajes{
    @Override
    public CuerpoAbstracto CrearCuerpo() {
        return new CuerpoElfo();
    }
    @Override
    public ArmaAbstracta CrearArma()  {
        return new ArmaElfo();
    }
    @Override
    public EscudoAbstracto CrearEscudo() {
        return new EscudoElfo();
    }
}
