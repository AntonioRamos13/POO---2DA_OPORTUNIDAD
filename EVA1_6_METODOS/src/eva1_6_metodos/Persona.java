/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_metodos;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String valor) {
        apellido = valor;

    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public int getEdad() {
        return edad;
    }
    public String generarNombreCompleto(){
        
        return (nombre + " "+ apellido);
    }
    public int generarAnioNacimiento(){
        return 2024 - edad;
    }
}
