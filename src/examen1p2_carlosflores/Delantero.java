package examen1p2_carlosflores;

public class Delantero extends Jugador {

    public Delantero() {
        super();
    }

    public Delantero(String nombre, String nacionalidad, String pieHabil, int edad, Equipo equipo) {
        super(nombre, nacionalidad, pieHabil, edad, equipo);
    }

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
