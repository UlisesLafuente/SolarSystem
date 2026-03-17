import java.util.List;
import java.util.stream.Collectors;

public class Consultor {

    public static void listCelestialBodys(CelestialBodysRegister CCR) {
        int i = 1;
        for (CelestialBody c : CCR.getCuerposCelestes()) {
            System.out.println(i + ". " + c.getScientificDescription());
            i++;
        }
    }

    public static List<Planet> filterPlanetsByAtmosphere(CelestialBodysRegister CCR) {
        return CCR.getCuerposCelestes().stream()
                .filter(cb -> cb instanceof Planet)
                .map(cb -> (Planet) cb)
                .filter(Planet::isAtmosphere)
                .collect(Collectors.toList());
    }

    public static List<Moon> filterMoonsByOrbitalPlanet(CelestialBodysRegister CCR, String orbitalPlanet) {
        return CCR.getCuerposCelestes().stream()
                .filter(cb -> cb instanceof Moon)
                .map(cc -> (Moon) cc)
                .filter(cc -> cc.getOrbitingPlanet().equals(orbitalPlanet))
                .collect(Collectors.toList());
    }

}
