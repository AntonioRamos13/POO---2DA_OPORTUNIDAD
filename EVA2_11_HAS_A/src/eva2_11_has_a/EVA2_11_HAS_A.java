/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva2_11_has_a;

/**
 *
 * @author Usuario
 */
public class EVA2_11_HAS_A {

    public static void main(String[] args) {
        Direccion direc= new Direccion(612, "Cafetales de Huixtla", "Cafetales", 31003, "Chihuahua", "Chihuahua" );
        Persona perso= new Persona("David","Ramos", 35, direc);
        System.out.println(perso.toString());
    }
    
}
