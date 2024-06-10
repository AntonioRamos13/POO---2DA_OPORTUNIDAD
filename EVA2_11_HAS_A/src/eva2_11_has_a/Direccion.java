/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_has_a;

/**
 *
 * @author Usuario
 */
public class Direccion {

    private int num;
    private String calle;
    private String colonia;
    private int cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.num = 0000;
        this.calle = "-----";
        this.colonia = "-----";
        this.cp = 00000;
        this.ciudad = "-----";
        this.estado = "-----";
    }
    public Direccion(int num, String calle, String colonia, int cp, String ciudad, String estado) {
        this.num = num;
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
   public String toString(){
   String cade= "\n"+"Numero: "+num +"\n"+ "Calle: "+calle+"\n"+"Colonia: "
           +colonia+"\n"+ "Cod. Postal: "+cp+"\n"+"Ciudad: "+ciudad+"\n"+
           "Estado: "+estado;
   return cade;
   } 
    
}
