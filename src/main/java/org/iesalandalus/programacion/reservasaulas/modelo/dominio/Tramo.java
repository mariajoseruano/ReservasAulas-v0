/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.reservasaulas.modelo.dominio;

/**
 *
 * @author usuario
 */
public enum Tramo {
    
    MANANA("Mañana"), TARDE( "Tarde");   
    private String cadenaAMostrar;
    
    private Tramo(String cadenaAMostrar){
        
        this.cadenaAMostrar=cadenaAMostrar;
    }

        
        
    @Override
    public String toString() {
        return "Tramo{" + "cadenaAMostrar=" + cadenaAMostrar + '}';
    }
        
        
        
        
        
        
    
      
    
}
