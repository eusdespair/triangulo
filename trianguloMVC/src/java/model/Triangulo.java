/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marua
 */
public class Triangulo {
    private final double lado;
    
    public Triangulo(double lado){
        this.lado=lado;
    }
    
    public double calcularArea(){
        return (lado*lado*Math.sqrt(3))/4;
    }
    public double calcularPerimetro(){
        return(lado*3);
    }
}

