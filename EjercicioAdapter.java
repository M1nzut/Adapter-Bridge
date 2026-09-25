public class EjercicioAdapter {
    public Ejercicio adaptar(EjercicioExterno externo) {
        return new Ejercicio(
            externo.getExercise(),
            externo.getWeight(),
            externo.getSets(),
            externo.getReps()
        );
    }
}
