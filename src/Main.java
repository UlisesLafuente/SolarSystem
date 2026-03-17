import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CelestialBody> cbodys = new ArrayList<>();

        Star sun = new Star("Sol", 1392700, 25, 5778, "G");
        Star betelgeuse = new Star("Betelgeuse", 887670000, 1850, 3500, "M");

        Planet earth = new Planet("Tierra", 12742, 24, 1, true);
        Planet mars = new Planet("Marte", 6779, 24, 2, true);

        Moon moon = new Moon("Luna", 3474, 655, "Tierra", true);
        Moon phobos = new Moon("Fobos", 22, 7, "Marte", true);

        cbodys.add(sun);
        cbodys.add(betelgeuse);
        cbodys.add(earth);
        cbodys.add(mars);
        cbodys.add(moon);
        cbodys.add(phobos);

        CelestialBodysRegister register = new CelestialBodysRegister(cbodys);

        System.out.println("=== LISTADO DE CUERPOS CELESTES ===");
        Consultor.listCelestialBodys(register);

        System.out.println("\n=== PLANETAS CON ATMÓSFERA ===");
        var planetasConAtmosfera = Consultor.filterPlanetsByAtmosphere(register);
        for (Planet p : planetasConAtmosfera) {
            System.out.println("- " + p.getName());
        }

        System.out.println("\n=== LUNAS DE MARTE ===");
        var lunasMarte = Consultor.filterMoonsByOrbitalPlanet(register, "Marte");
        for (Moon l : lunasMarte) {
            System.out.println("- " + l.getName());
        }

        System.out.println("\n=== INFORMES DE HABITABILIDAD ===");
        HabitabilityPrinter printer = new HabitabilityPrinter();

        printer.printReport(earth);
        System.out.println();
        printer.printReport(mars);
        System.out.println();
        printer.printReport(moon);
        System.out.println();
    }

}
