package pl.javastart.task;

public class Room {
    private double metricAre;
    private double currentTemperature;
    private boolean climaMounted;
    private double criticTemperature;

    public Room(double metricAre, double currentTemperature, boolean climaMounted) {
        this.metricAre = metricAre;
        this.currentTemperature = currentTemperature;
        this.climaMounted = climaMounted;
    }

    public double getMetricAre() {
        return metricAre;
    }

    private void setMetricAre(double metricAre) {
        this.metricAre = metricAre;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isClimaMounted() {
        return climaMounted;
    }

    public void setClimaMounted(boolean climaMounted) {
        this.climaMounted = climaMounted;
    }

    public double getCriticTemperature() {
        return criticTemperature;
    }

    public void setCriticTemperature(double criticTemperature) {
        this.criticTemperature = criticTemperature;
    }

    boolean reduceTemperature() {
        if (climaMounted == true && currentTemperature > 21 && currentTemperature > getCriticTemperature()) {
            return true;
        } else {
            return false;
        }
    }
}
