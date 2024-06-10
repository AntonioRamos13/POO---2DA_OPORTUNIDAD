/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Interfaces/Class.java to edit this template
 */

package eva2_6_clases_abstractas;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figuras{
      private double r;


    public Circulo() {
        this.r = 0;

    }

    public Circulo(double r) {
        this.r = r;

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

   

    @Override
    public double calcularArea() {
        return Math.PI* Math.pow(r, 2);
    }

    @Override
    public double calcularPeri() {
        return 2*Math.PI*r;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Circulo--------------------");
        System.out.println("Area: "+ calcularArea()+"u2"); 
        System.out.println("Perimetro: "+calcularPeri()+"u");
    }
}
