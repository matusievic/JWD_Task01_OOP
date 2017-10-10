package by.tc.task01.entity;

public class Laptop extends Appliance {
    // you may add your own code here
    private double batteryCapacity;
    private String os;
    private double memoryROM;
    private double systemMemory;
    private double cpu;
    private double displayInchs;

    public Laptop() {

    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Laptop laptop = (Laptop) obj;
        if (batteryCapacity != laptop.batteryCapacity) {
            return false;
        } else if (memoryROM != laptop.memoryROM) {
            return false;
        } else if (systemMemory != laptop.systemMemory) {
            return false;
        } else if (cpu != laptop.cpu) {
            return false;
        } else if (displayInchs != laptop.displayInchs) {
            return false;
        }
        if (os != null) {
            if (!os.equals(laptop.os)) {
                return false;
            }
        }

        return true;
    }
}
