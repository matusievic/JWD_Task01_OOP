package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	// you may add your own code here
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        Refrigerator refrigerator = (Refrigerator) obj;
        if (powerConsumption != refrigerator.powerConsumption) { return false; }
        if (weight != refrigerator.weight) { return false; }
        if (freezerCapacity != refrigerator.freezerCapacity) { return false; }
        if (overallCapacity != refrigerator.overallCapacity) { return false; }
        if (height != refrigerator.height) { return false; }
        if (width != refrigerator.width) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = powerConsumption;
        hash = 31 * hash + weight;
        hash = 31 * hash + freezerCapacity;
        hash = 31 * hash + overallCapacity;
        hash = 31 * hash + height;
        hash = 31 * hash + width;
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "powerConsumption: " + powerConsumption + ", weight: " + weight + ", freezerCapacity: " + freezerCapacity
                + "overallCapacity: " + overallCapacity + ", height: " + height + ", width: " + width;
    }
}
