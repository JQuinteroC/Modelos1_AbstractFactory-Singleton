/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

/**
 *
 * @author estudiantes
 */
public abstract class FabricaPersonajes {

    public abstract CuerpoAbstracto CrearCuerpo();
    public abstract ArmaAbstracta CrearArma();
    public abstract EscudoAbstracto CrearEscudo();
}
