public class Fuerza extends Entrenamiento {
    public Fuerza(Visualizacion visualizacion) {
        super(visualizacion);
    }

    public String mostrar(Ejercicio ejercicio) {
        return visualizacion.mostrar(ejercicio, "Fuerza");
    }
}
