/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Aitor
 */
public class Cerdo extends Granja {
    private double peso;
    private String raza;
    private int anios;
    
    /**
     *
     */
    public Cerdo() {
        super();
        peso = 00.00;
        raza = "";
        anios = 0;
    }

    /**
     *
     * @param peso
     * @param raza
     * @param anios
     * @param nombre
     * @param clase_de_animal
     * @param ubicacion
     * @param capacidad
     */
    public Cerdo(double peso, String raza, int anios, String nombre, String clase_de_animal, String ubicacion, int capacidad) {
        super(nombre, clase_de_animal, ubicacion, capacidad);
        this.peso = peso;
        this.raza = raza;
        this.anios = anios;
    }

    /**
     *
     * @return
     */
    public double getPeso() {
        return peso;
    }

    /**
     *
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     *
     * @return
     */
    public String getRaza() {
        return raza;
    }

    /**
     *
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     *
     * @return
     */
    public int getAnios() {
        return anios;
    }

    /**
     *
     * @param anios
     */
    public void setAnios(int anios) {
        this.anios = anios;
    }
    
    /**
     *
     */
    @Override
    public void cantidadMax(){
        if (anios >= 5){
            if( peso >= 150){
                System.out.println("El marrano sera matao");
            }
        }else{
            System.out.println("El marrano seguira vivo, por ahora");
        }
    }
}
