/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package eva3_4_try_catch;

/**
 *
 * @author Usuario
 */
public class EVA3_4_TRY_CATCH {

    public static void main(String[] args) {

        int x = 10, y = 0;
        int resu = 0;
        try {
            resu = x / y;
        }catch(ArithmeticException e){
            System.out.println("Uyy, el programa fallo exitosamente:]");
           e.printStackTrace();
        }
        System.out.println("Resultado de x/y = " + resu);
    }

}
