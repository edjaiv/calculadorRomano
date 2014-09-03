/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edjaiv.vivelabs.numerosromanos;

/**
 *
 * @author edwin
 */
public class NumeroRomanoNoValidoException extends Exception{

    public NumeroRomanoNoValidoException(String message) {
        super("El texto " + message + " no es un numero romano valido");
    }
    
}
