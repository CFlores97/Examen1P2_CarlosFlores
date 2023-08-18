/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosflores;


public class Delantero extends Jugador {

    @Override
    public void calcRatEsp() {
        this.setRitmo(ranNumProp());
        this.setDisparo(ranNumProp());
        this.setRegate(ranNumProp());
    }

    @Override
    public void calcRatGen() {
        this.setAgarre(ranNumGen());
        this.setLanzamiento(ranNumGen());
        this.setFisico(ranNumGen());
        this.setEntrada(ranNumGen());
        this.setVision(ranNumGen());
        this.setPassing(ranNumGen());
    }

}
