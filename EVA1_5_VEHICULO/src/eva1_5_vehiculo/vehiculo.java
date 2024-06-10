/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package eva1_5_vehiculo;

/**
 *
 * @author Usuario
 */
public class vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;
        
    public void setMarca(String valor){
        marca= valor;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String valor){
        modelo= valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAnio(int valor){
        anio= valor;
    }
    public int getAnio(){
        return anio;
    }
    public void setColor(String valor){
        color= valor;
    }
    public String getColor(){
        return color;
    }
    public void setPrecio(double valor){
        precio= valor;
    }
    public double getPrecio(){
        return precio;
    }
}
