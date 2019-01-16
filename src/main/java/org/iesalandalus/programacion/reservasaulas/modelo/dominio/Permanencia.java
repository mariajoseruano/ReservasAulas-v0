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
public class Permanencia {
    
    /* Revisar ejericios de Fechas */
    
        LocalDate dia;
        static final DateTimeFormatter FORMATODIA;
        private Tramo tramo;
        
        /* Crear el constructor Permanencia*/
        
        public Permanencia(LocalDate dia, Tramo tramo) {
		
                setDia(dia);
		setTramo(tramo);
        }
        
        /* Crear el constructor de copia*/
        
        public Permanencia( Permanencia permanencia)
        {
	        
            if (permanencia == null) {
		throw new IllegalArgumentException("No se puede copiar una permanencia nula.");
            }
		setDia(permanencia.dia);
		setTramo(permanencia.tramo);
		
        }
	
        public LocalDate getDia()
        {
            return new Dia(dia);
        }

        public Tramo getTramo()
        {
            return new Tramo(tramo);
            
            
        }
        
        private void setDia(LocalDate dia);
        
                if (dia == null) {
			throw new IllegalArgumentException("El día de una permanencia no puede ser nulo.");
		}
		
		this.dia= new  Dia(dia);
        
         private void setTramo(Tramo tramo);
        
                if (tramo == null) {
			throw new IllegalArgumentException("El tramo de una permanencia no puede ser nulo.");
		}
		
		this.dia= new  Dia(dia);

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.dia);
        hash = 73 * hash + Objects.hashCode(this.tramo);
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
        final Permanencia other = (Permanencia) obj;
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.tramo, other.tramo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Permanencia{" + "dia=" + dia + ", tramo=" + tramo + '}';
    }


        
    
}
