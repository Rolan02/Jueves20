/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves20;

/**
 *
 * @author rolando mamani salas
 */
public class Termino {
    private int coeficiente ;
    private char variable;

    public Termino(int coeficiente, char variable) {
        this.coeficiente = coeficiente;
        this.variable = variable;
    }
    public Termino(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getCoheficiente() {
        return coeficiente;
    }

    public char getVariable() {
        return variable;
    }

}
