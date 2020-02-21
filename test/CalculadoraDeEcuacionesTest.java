/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import jueves20.CalculadoraDeEcuaciones;
import jueves20.Ecuacion;
import jueves20.Termino;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rolando mamani salas
 */
public class CalculadoraDeEcuacionesTest {

    public CalculadoraDeEcuacionesTest() {
    }

    @Test
    public void sumarDosEcuacionesTest() {
        Ecuacion primeraEcuacion = new Ecuacion(new ArrayList<Termino>());
        Ecuacion segundaEcuacion = new Ecuacion(new ArrayList<Termino>());
        Ecuacion resultadoEsperado = new Ecuacion(new ArrayList<Termino>());
        CalculadoraDeEcuaciones sumar = new CalculadoraDeEcuaciones();

        primeraEcuacion.add(new Termino(2, 'x'));
        primeraEcuacion.add(new Termino(9, 'y'));
        primeraEcuacion.add(new Termino(2));

        segundaEcuacion.add(new Termino(16, 'x'));
        segundaEcuacion.add(new Termino(5, 'y'));
        segundaEcuacion.add(new Termino(36));

        resultadoEsperado.add(new Termino(18, 'x'));
        resultadoEsperado.add(new Termino(14, 'y'));
        resultadoEsperado.add(new Termino(38));
        
        Ecuacion resultadoObtnido = sumar.sumarDosEcuaciones(primeraEcuacion, segundaEcuacion);
        assertEquals(resultadoEsperado.get(0).getVariable() , resultadoObtnido.get(0).getVariable());
    }
}
