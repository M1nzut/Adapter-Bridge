public class VistaDetallada implements Visualizacion {
    public String mostrar(Ejercicio ejercicio, String tipo) {
        return "Ejercicio: " + ejercicio.getNombre()
            + "\nTipo: " + tipo
            + "\nPeso: " + ejercicio.getPeso() + " kg"
            + "\nSeries: " + ejercicio.getSeries()
            + "\nRepeticiones: " + ejercicio.getRepeticiones();
    }
}
