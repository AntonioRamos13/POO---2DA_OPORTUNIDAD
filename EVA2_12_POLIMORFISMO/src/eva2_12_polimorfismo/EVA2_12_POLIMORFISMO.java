/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva2_12_polimorfismo;

/**
 *
 * @author Usuario
 */
public class EVA2_12_POLIMORFISMO {

    public static void main(String[] args) {
      Estudiante estu= new Estudiante("12345678", "David", "Ramos");
        System.out.println(estu);
          Persona persona = estu;
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellidos());
    }
    
}
class Persona{
     private String nombre;
    private String apellidos;

    public Persona() {
          this.nombre = "-----";
        this.apellidos = "-----";
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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
    
    @Override
    public String toString(){
       String cade= nombre + " "+apellidos;
       return cade;
    }
}
class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
        super();
        this.noControl= "---------";
    }
    public Estudiante(String noControl, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
   public String toString(){
        String cade= super.toString()+" "+noControl;
        return cade;
    }
}