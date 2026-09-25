public abstract class Entrenamiento {
    protected Visualizacion visualizacion;

    public Entrenamiento(Visualizacion visualizacion) {
        this.visualizacion = visualizacion;
    }

    public abstract String mostrar(Ejercicio ejercicio);
}
