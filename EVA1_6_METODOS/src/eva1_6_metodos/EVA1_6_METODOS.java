/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package eva1_6_metodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_6_METODOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.setNombre("David");
        perso1.setEdad(50);
        perso1.setApellido("Ramos");
        System.out.println("Nombre:" + perso1.generarNombreCompleto());
        System.out.println("Anio: " + perso1.generarAnioNacimiento());
        Persona[] grupo = new Persona[5];
        for (int i = 0; i < grupo.length; i++) {
            grupo[i] = new Persona();
            Scanner captura= new Scanner(System.in);
            System.out.println("Ingrese nombre: ");
            String nombre= captura.nextLine();
            grupo[i].setNombre(nombre);
            System.out.println("Ingrese apellidos: ");
            String ape= captura.nextLine();
            grupo[i].setApellido(ape);
            System.out.println("Ingrese edad: ");
            int edad= captura.nextInt();
            grupo[i].setEdad(edad);
        }
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("Nombre:" + grupo[i].generarNombreCompleto());
        System.out.println("Anio: " + grupo[i].generarAnioNacimiento()); 
        }
    }

}
