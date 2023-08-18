
package examen1p2_carlosflores;

import java.util.ArrayList;


public class Equipo {
    private String nombre, pais;
    private int rating; 
    
   private ArrayList<Jugador> plantilla = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    

    public Equipo(String nombre, String pais, int rating) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return nombre;
        //return "Equipo{" + "nombre=" + nombre + ", pais=" + pais + ", rating=" + rating + ", plantilla=" + plantilla + '}';
    }
    
    public int calcRatingE(){
        int suma = 0;
        
        for (Jugador jugador : plantilla) {
            suma += jugador.getRating();
        }
        return suma / 4;
    }
}
