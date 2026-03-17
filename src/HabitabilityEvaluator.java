public interface HabitabilityEvaluator {

    boolean evaluate(CelestialBody cb);

    String getHabitabilityReport(CelestialBody cb);
}
