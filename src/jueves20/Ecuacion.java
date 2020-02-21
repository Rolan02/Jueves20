/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves20;

import java.util.ArrayList;

/**
 *
 * @author rolando Mamani salas
 */
public class Ecuacion {

    private ArrayList<Termino> ecuacion;

    public Ecuacion(ArrayList<Termino> ecuacion) {
        this.ecuacion = ecuacion;
    }

    public Termino get(int i) {
        return ecuacion.get(i);
    }

    public int size() {
        return ecuacion.size();
    }

    public Termino remove(int i) {
        return ecuacion.remove(i);
    }

    public boolean isEmpty() {
        return ecuacion.isEmpty();
    }

    public void add(Termino termino) {
        ecuacion.add(termino);
    }

}
