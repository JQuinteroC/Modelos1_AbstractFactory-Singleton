/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armas.ArmaAbstracta;
import Armas.ArmaMago;
import Cuerpos.CuerpoAbstracto;
import Cuerpos.CuerpoMago;
import Escudos.EscudoAbstracto;
import Escudos.EscudoMago;

/**
 *
 * @author estudiantes
 */
public class FabricaMagos extends FabricaPersonajes{
    @Override
    public CuerpoAbstracto CrearCuerpo() {
        return new CuerpoMago();
    }
    @Override
    public ArmaAbstracta CrearArma()  {
        return new ArmaMago();
    }
    @Override
    public EscudoAbstracto CrearEscudo() {
        return new EscudoMago();
    }
}
