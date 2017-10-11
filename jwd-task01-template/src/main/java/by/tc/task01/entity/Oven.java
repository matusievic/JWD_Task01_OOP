package by.tc.task01.entity;

public class Oven extends Appliance{
	// you may add your own code here
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
        if (obj == this) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        Oven oven = (Oven) obj;
        if (powerConsumption != oven.powerConsumption) { return false; }
        if (weight != oven.weight) { return false; }
        if (capacity != oven.capacity) { return false; }
        if (depth != oven.depth) { return false; }
        if (height != oven.height) { return false; }
        if (width != oven.width) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = powerConsumption;
        hash = 31 * hash + weight;
        hash = 31 * hash + capacity;
        hash = 31 * hash + depth;
        hash = 31 * hash + height;
        hash = 31 * hash + width;
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "powerConsumption: " + powerConsumption + ", weight: " + weight + ", capacity: " + capacity
                + ", depth: " + depth + ", height: " + height + ", width: " + width;
    }
}
