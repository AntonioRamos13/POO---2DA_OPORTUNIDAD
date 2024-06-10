/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class EVA3_9_THROW {

    public static void main(String[] args) {
        try {
            metodoProblematico();
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    public static void metodoProblematico() throws Exception{
        System.out.println("Trouble Maker!! D:"); 
        throw new Exception("TE VOY A ANEXAR >:D");
       
    }
}
