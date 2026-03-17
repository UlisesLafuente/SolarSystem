public abstract class CelestialBody {
    private final String name;
    private final int diameter;
    private final int dayLenght;

    private HabitabilityEvaluator HE;

    protected CelestialBody(String name, int diameter, int dayLenght) {
        this.name = name;
        this.diameter = diameter;
        this.dayLenght = dayLenght;

        this.HE = new NoHabitabilityEvaluator();
    }
    public void setResistanceEvaluator(HabitabilityEvaluator evaluator) {
        this.HE = evaluator;
    }

    public String getHabitabilityReport() {
        return HE.getHabitabilityReport(this);
    }

    public boolean isHabitable() {
        return HE.evaluate(this);
    }

    public abstract String getScientificDescription();

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getDayLenght() {
        return dayLenght;
    }


    //- **Nombre** del cuerpo celeste.
    //- **Diámetro** (en kilómetros).
    //- **Duración del día** (en horas).
}
