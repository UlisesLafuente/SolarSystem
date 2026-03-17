public class NoHabitabilityEvaluator implements HabitabilityEvaluator{
    @Override
    public boolean evaluate(CelestialBody cb) {
        return false;
    }

    @Override
    public String getHabitabilityReport(CelestialBody cb) {
        return "No evaluable";
    }
}
