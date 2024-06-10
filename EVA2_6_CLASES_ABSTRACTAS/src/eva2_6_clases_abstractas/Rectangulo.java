/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package eva2_6_clases_abstractas;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends Figuras {

    private double b;
    private double h;

    public Rectangulo() {
        this.b = 0;
        this.h = 0;
    }

    public Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return b * h;
    }

    @Override
    public double calcularPeri() {
        return (2*b)+(2*h);
    }  
      @Override
    public void imprimirDatos() {
        System.out.println("Rectangulo-----------------");
        System.out.println("Area: "+ calcularArea()+"u2"); 
        System.out.println("Perimetro: "+calcularPeri()+"u");
    }
}
