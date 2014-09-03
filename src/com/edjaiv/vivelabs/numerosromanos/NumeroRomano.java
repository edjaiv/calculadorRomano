/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edjaiv.vivelabs.numerosromanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author edwin
 */
public class NumeroRomano {

    String romano;

    /**
     * Construye un objeto sin una representacion de numero romano.
     */
    public NumeroRomano() {
        romano = "";
    }

    /**
     * Recibe una cadena de texto, si es un numero romano valido devuelve un
     * objeto NumeroRomano, de lo contrario lanza una excepcion
     *
     * @param numeroRomano
     */
    public NumeroRomano(String texto) throws NumeroRomanoNoValidoException {
        if (esValido(texto)) {
            romano = texto;
        } else {
            throw new NumeroRomanoNoValidoException(texto);
        }
    }

    /**
     * Suma la representacion del numero romano que entra 
     * como parametro al existente
     * Si alguno de los dos no tiene una representacion valida
     * de numero romano, lanza una excepcion
     * @param numeroRomano
     * @return
     * @throws NumeroRomanoNoValidoException 
     */
    public String agregar(String numeroRomano) throws NumeroRomanoNoValidoException {
        String rta = "";
        if(esValido(numeroRomano) ){
            if(esValido(romano)){
                rta = toRomano(toDecimal(numeroRomano) + toDecimal());
            }else{
                throw new NumeroRomanoNoValidoException(romano);
            }
        }else{
            throw new NumeroRomanoNoValidoException(numeroRomano);
        }
        return rta;
    }

    /**
     * Suma el numero romano que entra como parametro al existente
     * Si alguno de los dos no tiene una representacion valida
     * de numero romano, lanza una excepcion
     * 
     * @param numeroRomano
     * @return
     * @throws NumeroRomanoNoValidoException 
     */
    public String agregar(NumeroRomano numeroRomano) throws NumeroRomanoNoValidoException {
        return toRomano(numeroRomano.toDecimal() + toDecimal());
    }

    /**
     * Devuelve la representacion en romano del valor que entra como parametro
     *
     * @param valor
     * @return
     */
    public String toRomano(int valor) {
        String rta = "";
        int i = 0;
        String[][] equivalencias = new String[][]{new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}};
        while (valor > 0 && i < 3) {
            rta = equivalencias[i][valor % 10] + rta;
            valor = valor / 10;
            i++;
        }
        for (i = 0; i < valor; i++) {
            rta = "M" + rta;
        }
        return rta;
    }

    /**
     * Devuelve la representacion decimal del numero romano
     *
     * @return
     */
    public int toDecimal() throws NumeroRomanoNoValidoException{
        return toDecimal(romano);
    }

    /**
     * Devuelve la representacion decimal del numero romano que entra como
     * parametro, si no es un numero romano valido lanza la excepcion
     * NumeroRomanoNoValidoException
     *
     * @param arg
     * @return
     */
    public int toDecimal(String arg) throws NumeroRomanoNoValidoException {
        if (esValido(arg)) {
            char[] rta = arg.replace(" ", "").toUpperCase().toCharArray();
            char ultimo = ' ';
            int valor = 0;
            for (int i = rta.length - 1; i >= 0; i--) {
                switch (rta[i]) {
                    case 'I':
                        switch (ultimo) {
                            case 'I':
                                valor += 1;
                                break;
                            case 'V':
                            case 'X':
                                valor -= 1;
                                break;
                            case ' ':
                                valor = 1;
                                break;
                        }
                        break;
                    case 'V':
                        switch (ultimo) {
                            case 'I':
                                valor += 5;
                                break;
                            case ' ':
                                valor = 5;
                                break;
                        }
                        break;
                    case 'X':
                        switch (ultimo) {
                            case 'X':
                            case 'V':
                            case 'I':
                                valor += 10;
                                break;
                            case 'L':
                            case 'C':
                                valor -= 10;
                                break;
                            case ' ':
                                valor = 10;
                                break;
                        }
                        break;
                    case 'L':
                        switch (ultimo) {
                            case 'X':
                            case 'V':
                            case 'I':
                                valor += 50;
                                break;
                            case ' ':
                                valor = 50;
                                break;
                        }
                        break;
                    case 'C':
                        switch (ultimo) {
                            case 'X':
                            case 'V':
                            case 'I':
                            case 'L':
                            case 'C':
                                valor += 100;
                                break;
                            case 'D':
                            case 'M':
                                valor -= 100;
                                break;
                            case ' ':
                                valor = 100;
                                break;
                        }
                        break;
                    case 'D':
                        switch (ultimo) {
                            case 'X':
                            case 'V':
                            case 'I':
                            case 'L':
                            case 'C':
                                valor += 500;
                                break;
                            case ' ':
                                valor = 500;
                                break;
                        }
                        break;
                    case 'M':
                        switch (ultimo) {
                            case 'X':
                            case 'V':
                            case 'I':
                            case 'L':
                            case 'C':
                            case 'M':
                            case 'D':
                                valor += 1000;
                                break;
                            case ' ':
                                valor = 1000;
                                break;
                        }
                        break;
                }

                ultimo = rta[i];
            }

            return valor;
        } else {
            throw new NumeroRomanoNoValidoException(arg);
        }
    }

    public final boolean esValido(String texto) {
        return texto.length()>0 && Pattern.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$",texto);
    }
}
