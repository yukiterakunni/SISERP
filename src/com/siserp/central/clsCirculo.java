/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central;

/**
 *
 * @author JHON.VIVAS
 */
public class clsCirculo extends clsFigura{
    private double radio;
    final double pi = 3.141516;
    
    public clsCirculo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double CalcularArea(){
        double resultado;
        resultado = pi*(Math.pow(radio, 2));
        return resultado;
    }

    @Override
    public double CalcularPerimetro(){
        double resultado;
        resultado = 2*(pi*radio);
        return resultado;
    }
}
