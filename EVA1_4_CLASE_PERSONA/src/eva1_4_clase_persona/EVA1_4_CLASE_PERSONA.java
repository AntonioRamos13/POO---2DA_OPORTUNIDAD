/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva1_4_clase_persona;

/**
 *
 * @author Usuario
 */
public class EVA1_4_CLASE_PERSONA {

    public static void main(String[] args) {
        
       Persona perso1= new  Persona();
       perso1.setNombre("David");
       perso1.setEdad(50);
       perso1.setApellido("Ramos");
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
    }
    
}
class Persona {

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
}
