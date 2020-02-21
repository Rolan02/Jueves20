/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves20;

import java.util.ArrayList;

/**
 *
 * @author rolando mamani salas
 */
public class CalculadoraDeEcuaciones {

    public CalculadoraDeEcuaciones() {
    }

    public Ecuacion sumarDosEcuaciones(Ecuacion primeraEcuacion, Ecuacion segundaEcuacion) {
        Ecuacion resultadoSuma = new Ecuacion(new ArrayList<>());

        Termino termino;
        int nuevoCoeficienteX = 0;
        int nuevoCoeficienteY = 0;
        int coeficienteSolito = 0;

        termino = primeraEcuacion.remove(0);

        if (termino.getVariable() == 'x') {
            nuevoCoeficienteX += termino.getCoheficiente();
        } else {
            if (termino.getVariable() == 'y') {
                nuevoCoeficienteY += termino.getCoheficiente();
            }
        }
        coeficienteSolito += termino.getCoheficiente();

        termino = segundaEcuacion.remove(0);

        if (termino.getVariable() == 'x') {
            nuevoCoeficienteX += termino.getCoheficiente();
        } else {
            if (termino.getVariable() == 'y') {
                nuevoCoeficienteY += termino.getCoheficiente();

                coeficienteSolito += termino.getCoheficiente();
            }
        }
        resultadoSuma.add(new Termino(nuevoCoeficienteX, 'x'));
        resultadoSuma.add(new Termino(nuevoCoeficienteY, 'y'));
        resultadoSuma.add(new Termino(coeficienteSolito));
        return resultadoSuma;
    }

    public int[] BusquedaListaResultado(int[] listaBusqueda, int[] listaSecuencial) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean condicion = false;
        for (int i = 0; i < listaBusqueda.length; i++) {
            if (listaBusqueda[i] == listaSecuencial[0]) {
                for (int j = 0; j < listaSecuencial.length; j++) {
                    if (listaSecuencial[j] == listaBusqueda[i + j]) {
                        condicion = true;
                    } else {
                        condicion = false;
                    }
                }
                if (condicion) {
                    result.add(i);
                }
            }
        }
        return getArreglo(result);

    }

    private int[] getArreglo(ArrayList<Integer> arreglo) {
        int[] result = new int[arreglo.size()];
        for (int i = 0; i < arreglo.size(); i++) {
            result[i] = arreglo.get(i);
        }
        return result;
    }

    public int BusquedaLineal(ArrayList<Integer> arreglo, int valorABuscar) {

        int result = 0;
        for (int i = 0; i < arreglo.size(); i++) {
            if (valorABuscar == arreglo.get(i)) {
                result++;
            }
        }
        return result;
    }


}
