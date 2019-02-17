
package org.lasencinas.bicipalma;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.lasencinas.bicipalma.Bicicleta;

public class Estacion {
    
    //ATRIBUTOS
        
    private int id = 0;
    private String direccion = null;
    private int numeroAnclajes = 0;
    private ArrayList<Bicicleta> anclajes = new ArrayList<>();
    
    //Setters & Getters
    
    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }
    
    public void consultarEstacion() {
        System.out.println("Id: "+ this.id);
        System.out.println("Direccion: "+ this.direccion);
        System.out.println("Numero de anclajes: "+ this.numeroAnclajes);
    }
    
    public int anclajesLibres() {
        int anclajesLibres = 0;
        
        for (int i = 0; i < anclajes.size(); i++) {
            if (anclajes.get(i) == null) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }
    
    public int generarAnclaje() {
        Integer numeroEntero = ThreadLocalRandom.current().nextInt(0, this.numeroAnclajes);
        return numeroEntero;
    }
    
    public void anclarBicicleta(Bicicleta bicicleta) {
        anclajes.add(bicicleta);
        mostrarAnclaje(bicicleta,  numeroAnclajes);
    }
    
    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclajes) {
        System.out.println("Bicicleta: "+ bicicleta.getId()+"anclada en el anclaje:"+ numeroAnclajes);
    }
            
}
