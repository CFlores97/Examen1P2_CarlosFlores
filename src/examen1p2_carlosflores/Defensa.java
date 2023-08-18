/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosflores;

/**
 *
 * @author carlo
 */
public class Defensa extends Jugador {

    public Defensa() {
        super();
    }

    public Defensa(String nombre, String nacionalidad, String pieHabil, int edad, int rating, Equipo equipo) {
        super(nombre, nacionalidad, pieHabil, edad, rating, equipo);
    }

    @Override
    public void calcRatEsp() {
        this.setFisico(ranNumProp());
        this.setRitmo(ranNumProp());
        this.setEntrada(ranNumProp());
    }

    @Override
    public void calcRatGen() {
        this.setAgarre(ranNumGen());
        this.setLanzamiento(ranNumGen());
        this.setPassing(ranNumGen());
        this.setRegate(ranNumGen());
        this.setVision(ranNumGen());
        this.setDisparo(ranNumGen());
    }

}
