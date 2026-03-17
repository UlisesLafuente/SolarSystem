public class Planet extends CelestialBody{

    private final int moonCount;
    private final boolean atmosphere;

    public Planet(String name, int diameter, int dayLenght, int moonCount, boolean atmosphere) {
        super(name, diameter, dayLenght);
        this.moonCount = moonCount;
        this.atmosphere = atmosphere;

        setHabitabilityEvaluator(new PlanetHabitabilityEvaluator());
    }

    @Override
    public String getScientificDescription() {
        return String.format("%s tiene un diametro de %d km%s. Cuenta con %d luna.",
                getName(),getDiameter(),  (isAtmosphere() ? "y posee una atmósfera" : ""), getMoonCount());
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public int getMoonCount() {
        return moonCount;
    }
}
