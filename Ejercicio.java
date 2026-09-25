public class Ejercicio {
    private String nombre;
    private double peso;
    private int series;
    private int repeticiones;

    public Ejercicio(String nombre, double peso, int series, int repeticiones) {
        this.nombre = nombre;
        this.peso = peso;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public String getNombre() { return nombre; }
    public double getPeso() { return peso; }
    public int getSeries() { return series; }
    public int getRepeticiones() { return repeticiones; }
}
