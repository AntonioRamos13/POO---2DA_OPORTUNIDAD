/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva2_15_clases_anonimas;

/**
 *
 * @author Usuario
 */
public class EVA2_15_CLASES_ANONIMAS {

    public static void main(String[] args) {
        Prueba prueba= new Prueba() {

            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo :>");
            }
        };
        prueba.mostrarMensaje();
        
        ClaseAbstracta prueba2= new ClaseAbstracta() {

            @Override
            public void mensaje() {
                System.out.println("Otro mensaje abstracto"); 
            }
        };
        
        prueba2.mensaje();
        prueba2.otroMensaje();
    }
    
}
 interface Prueba{
     public void mostrarMensaje();
 }

abstract class ClaseAbstracta{
    public abstract void mensaje();
    public void otroMensaje(){
        System.out.println("Hola mundo abstracto!!");
    }
}