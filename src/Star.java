public class Star extends CelestialBody{
    private final int temperatureSurface;
    private final String spectralType;

    public Star(String name, int diameter, int dayLenght, int temperatureSurface, String spectralType) {
        super(name, diameter, dayLenght);
        this.temperatureSurface = temperatureSurface;
        this.spectralType = spectralType;
    }

    @Override
    public String getScientificDescription() {
        return String.format("%s es una estrella de tipo %s con una temperatura superficial de %d k.%s",
                getName(),getSpectralType(),getTemperatureSurface(),
                getName().equalsIgnoreCase("sol")?"Es la principal fuente de energía del sistema solar":"");
    }

    public String getSpectralType() {
        return spectralType;
    }

    public int getTemperatureSurface() {
        return temperatureSurface;
    }
}
