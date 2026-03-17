public class Moon extends CelestialBody{
    private final String orbitingPlanet;
    private final boolean rockySurface;

    public Moon(String name, int diameter, int dayLenght, String orbitingPlanet, boolean rockySurface) {
        super(name, diameter, dayLenght);
        this.orbitingPlanet = orbitingPlanet;
        this.rockySurface = rockySurface;

        setHabitabilityEvaluator(new MoonHabitabilityEvaluator());
    }

    @Override
    public String getScientificDescription() {
        return String.format("%s orbita alrededor de %s. %s diametro es de %d km.",
                getName(),getOrbitingPlanet(),(isRockySurface()? "Su superficie es rocosa y su":"Su"),getDiameter());
    }

    public boolean isRockySurface() {
        return rockySurface;
    }

    public String getOrbitingPlanet() {
        return orbitingPlanet;
    }
}
