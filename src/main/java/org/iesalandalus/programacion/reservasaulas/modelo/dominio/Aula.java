/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.reservasaulas.modelo.dominio;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Aula {
    
        private String nombre;
        
        /* Se crea el constructor*/
        
        public Aula(String nombre){
            
            setNombre(nombre);
                       
        }
        
        /*Se crea el constructor copia */
        
        public Aula (Aula aula){
            
            if (aula==null)
                    
                    throw new IllegalArgumentException("No se puede copiar un aula nula.");
           
            setNombre(aula.nombre);
        }
        
        /* Se crea el método Setter y getter*/
        
        private void setNombre( String nombre){
            
            if  (nombre == null) {
                    throw new IllegalArgumentException("El nombre del aula no puede ser nulo.");
            }
            if (nombre.equals("")) {
                    throw new IllegalArgumentException("El nombre del aula no puede estar vacío.");
            }
		this.nombre = nombre;
                
        }
        
        public String getNombre(){
            
            return nombre;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aula other = (Aula) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

        
                    
    @Override
    public String toString() {
        return "Aula{" + "nombre=" + nombre + '}';
    }
        
        
        
}



