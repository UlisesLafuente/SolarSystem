public class PlanetHabitabilityEvaluator implements HabitabilityEvaluator{
    @Override
    public boolean evaluate(CelestialBody cb) {
        if (!(cb instanceof Planet)) {
            return false;
        }
        return ((Planet) cb).isAtmosphere();
    }
    @Override
    public String getHabitabilityReport(CelestialBody cb) {
        boolean passed = evaluate(cb);
        return passed ? "El planeta tiene atmósfera y es habitable." : "Planeta inhabitable.";
    }
}
