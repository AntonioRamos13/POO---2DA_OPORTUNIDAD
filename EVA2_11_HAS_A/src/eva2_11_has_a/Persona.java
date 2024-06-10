/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_has_a;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direc; 

    public Persona() {
         this.nombre = "-----";
        this.apellidos ="------";
        this.edad = 0;
        this.direc = null;
    }

    public Persona(String nombre, String apellidos, int edad, Direccion direc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direc = direc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDirec() {
        return direc;
    }

    public void setDirec(Direccion direc) {
        this.direc = direc;
    }

    @Override
    public String toString() {
        String cade = "Nombre: " + nombre +"\n"+ "Apellidos: "+ apellidos + "\n"
                + "Edad: " + edad + "\n" + "Direccion: " + direc.toString();
        return cade;
    }

}
