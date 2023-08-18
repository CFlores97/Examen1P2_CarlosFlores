
package examen1p2_carlosflores;

import java.util.Random;


public abstract class Jugador {
    Random ran = new Random();
    //generales
    private String nombre, nacionalidad, pieHabil;
    private int edad, rating;
    private Equipo equipo = new Equipo();
    
    // especificas
    private int agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo;

    public Jugador() {
    }

    public Jugador(String nombre, String nacionalidad, String pieHabil, int edad, int rating, Equipo equipo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.edad = edad;
        setRating(rating);
        this.equipo = equipo;
        
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        int numerador = agarre + lanzamiento + fisico + ritmo + entrada + vision + passing + regate + disparo;
        int dennominador  = 9;
        
        int promedio = numerador/dennominador;
        
        this.rating = promedio;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", pieHabil=" + pieHabil + ", edad=" + edad + ", rating=" + rating + ", equipo=" + equipo + ", agarre=" + agarre + ", lanzamiento=" + lanzamiento + ", fisico=" + fisico + ", ritmo=" + ritmo + ", entrada=" + entrada + ", vision=" + vision + ", passing=" + passing + ", regate=" + regate + ", disparo=" + disparo + '}';
    }
    
    public int ranNumProp(){
        
        
        int ranNum = ran.nextInt(12) + 1;
        int value = ranNum * 12;
        
        while (value * 12 < 70){
            ranNum = ran.nextInt(12) + 1;
            value = ranNum * 12;
        }
        
        return ranNum;
        
    }
    
    public int ranNumGen(){
        int ranNum = ran.nextInt(5) + 1;
        int value = ranNum * 13;
        
        return value;
    }
    public abstract void calcRatEsp();
    public abstract void calcRatGen();

    
    
    
}
