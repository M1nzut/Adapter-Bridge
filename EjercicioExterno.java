public class EjercicioExterno {
    private String exercise;
    private double weight;
    private int sets;
    private int reps;

    public EjercicioExterno(String exercise, double weight, int sets, int reps) {
        this.exercise = exercise;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;
    }

    public String getExercise() { return exercise; }
    public double getWeight() { return weight; }
    public int getSets() { return sets; }
    public int getReps() { return reps; }
}
