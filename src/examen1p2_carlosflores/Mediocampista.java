package examen1p2_carlosflores;

public class Mediocampista extends Jugador {

    public Mediocampista() {
        super();
    }

    public Mediocampista(String nombre, String nacionalidad, String pieHabil, int edad, Equipo equipo) {
        super(nombre, nacionalidad, pieHabil, edad, equipo);
    }

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
