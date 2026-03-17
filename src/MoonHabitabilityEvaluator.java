public class MoonHabitabilityEvaluator implements HabitabilityEvaluator{
    public boolean evaluate(CelestialBody cb) {
        if (!(cb instanceof Moon)) {
            return false;
        }
        return ((Moon) cb).isRockySurface();
    }
    @Override
    public String getHabitabilityReport(CelestialBody cb) {
        boolean passed = evaluate(cb);
        return passed ? "Esta es una luna rocosa y podría ser habitable." : "Luna inhabitable.";
    }
}
