import java.util.ArrayList;

public class CelestialBodysRegister {
    private final ArrayList<CelestialBody> celestialBodys = new ArrayList<>();

    public CelestialBodysRegister(ArrayList<CelestialBody> cb) {
        this.celestialBodys.addAll(cb);
    }

    public void addCuerpoCeleste(CelestialBody cb) {
        this.celestialBodys.add(cb);
    }

    public ArrayList<CelestialBody> getCuerposCelestes() {
        return this.celestialBodys;
    }
}