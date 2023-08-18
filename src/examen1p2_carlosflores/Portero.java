package examen1p2_carlosflores;



public class Portero extends Jugador {

    public Portero() {
        super();
    }

    public Portero(String nombre, String nacionalidad, String pieHabil, int edad, int rating, Equipo equipo) {
        super(nombre, nacionalidad, pieHabil, edad, rating, equipo);
    }

    @Override
    public void calcRatEsp() {
        this.setAgarre(ranNumProp());
        this.setLanzamiento(ranNumProp());
        this.setPassing(ranNumProp());
        

    }

    @Override
    public void calcRatGen() {
        this.setDisparo(ranNumGen());
        this.setFisico(ranNumGen());
        this.setRitmo(ranNumGen());
        this.setEntrada(ranNumGen());
        this.setRegate(ranNumGen());
        this.setVision(ranNumGen());
    }

}
