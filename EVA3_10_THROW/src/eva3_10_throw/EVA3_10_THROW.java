/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva3_10_throw;

/**
 *
 * @author Usuario
 */
public class EVA3_10_THROW {

    public static void main(String[] args) {
        try {
             Persona perso= new Persona();
             perso.setNombre("Vania");
             perso.setApe("Ramos");
             perso.setEdad(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("FIN!");
    }
    
}
