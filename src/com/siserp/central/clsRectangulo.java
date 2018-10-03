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
public class clsRectangulo extends clsFigura {
    private double base;
    private double altura;
    
    public clsRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double CalcularArea() {
        double result;
        result = base * altura;
        return result;
    }

    @Override
    public double CalcularPerimetro() {
        double result;
        result = 2*(base+altura);
        return result;
    }
    
}
