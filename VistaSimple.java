public class VistaSimple implements Visualizacion {
    public String mostrar(Ejercicio ejercicio, String tipo) {
        return ejercicio.getNombre() + " - " + ejercicio.getPeso() + " kg";
    }
}
