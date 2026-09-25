public class Hipertrofia extends Entrenamiento {
    public Hipertrofia(Visualizacion visualizacion) {
        super(visualizacion);
    }

    public String mostrar(Ejercicio ejercicio) {
        return visualizacion.mostrar(ejercicio, "Hipertrofia");
    }
}
