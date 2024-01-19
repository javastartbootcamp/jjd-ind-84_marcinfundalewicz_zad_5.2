package pl.javastart.task;

public class Room {
    public double metricAre;
    public double currentTemperature;
    public boolean climaMounted;
    public double criticTemperature;

    public Room(double metricAre, double currentTemperature, double criticTemperature, boolean climaMounted) {
        this.metricAre = metricAre;
        this.currentTemperature = currentTemperature;
        this.criticTemperature = criticTemperature;
        this.climaMounted = climaMounted;
    }

    boolean reduceTemperature() {
        if (climaMounted && currentTemperature > criticTemperature + 1) {
            currentTemperature = currentTemperature - 1;
            return true;
        } else if (climaMounted && currentTemperature > criticTemperature) {
            currentTemperature = criticTemperature;
            return true;
        } else {
            return false;
        }
    }
}
