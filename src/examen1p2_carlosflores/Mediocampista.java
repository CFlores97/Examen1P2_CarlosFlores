package examen1p2_carlosflores;

public class Mediocampista extends Jugador {

    @Override
    public void calcRatEsp() {
        this.setVision(ranNumProp());
        this.setPassing(ranNumProp());
        this.setRegate(ranNumProp());
    }

    @Override
    public void calcRatGen() {

        this.setAgarre(ranNumGen());
        this.setLanzamiento(ranNumGen());
        this.setDisparo(ranNumGen());
        this.setFisico(ranNumGen());
        this.setRitmo(ranNumGen());
        this.setEntrada(ranNumGen());
    }

}
