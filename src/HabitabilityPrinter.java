public class HabitabilityPrinter {
    public void printReport(CelestialBody cb) {
        System.out.println("Habitability Analysis:");
        System.out.println("Cuerpo celeste: " + cb.getName());
        System.out.println(cb.getHabitabilityReport());
    }
}