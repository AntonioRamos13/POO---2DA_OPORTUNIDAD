/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva1_2_instanciacion;

/**
 *
 * @author Usuario
 */
public class EVA1_2_INSTANCIACION {

    
    public static void main(String[] args) {
        
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.apellido = "Ramos";
        perso1.nombre = "David";
        perso1.edad = 45;
    }

}

class Persona {

    String nombre;
    String apellido;
    int edad;
}
