/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva3_3_propagacion_excepciones;

/**
 *
 * @author Usuario
 */
public class EVA3_3_PROPAGACION_EXCEPCIONES {

    public static void main(String[] args) {
        A();
    }

    private static void A() {
        B();
    }

    private static void B() {
       C();
    }

    private static void C() {
        int x= 9, y=0;
        int resul= x/y;
        System.out.println(resul);
    }
    
}
