package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{
	// you may add your own code here
    private double batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        TabletPC tabletPC = (TabletPC) obj;
        if (batteryCapacity != tabletPC.batteryCapacity) { return false; }
        if (displayInches != tabletPC.displayInches) { return false; }
        if (memoryROM != tabletPC.memoryROM) { return false; }
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) { return false; }
        if (Objects.deepEquals(color, tabletPC.color)) { return false; }

        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "batteryCapacity: " + batteryCapacity + ", displayInchs: " + displayInches
                + ", memoryROM: " + memoryROM + ", flashMemoryCapacity: " + flashMemoryCapacity + ", color: " + color;
    }
}
