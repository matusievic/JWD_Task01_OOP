package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
	// you may add your own code here
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
        if (powerConsumption != vacuumCleaner.powerConsumption) { return false; }
        if (!Objects.equals(filterType, vacuumCleaner.filterType)) { return false; }
        if (!Objects.equals(bagType, vacuumCleaner.bagType)) { return false; }
        if (!Objects.equals(wandType, vacuumCleaner.wandType)) { return false; }
        if (motorSpeedRegulation != vacuumCleaner.motorSpeedRegulation) { return false; }
        if (cleaningWidth != vacuumCleaner.cleaningWidth) { return false; }

        return false;
    }

    @Override
    public int hashCode() {
        double hash = powerConsumption;
        hash = 31 * hash + Objects.hashCode(filterType);
        hash = 31 * hash + Objects.hashCode(bagType);
        hash = 31 * hash + Objects.hashCode(wandType);
        hash = 31 * hash + motorSpeedRegulation;
        hash = 31 * hash + cleaningWidth;
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "powerConsumption: " + powerConsumption + ", filterType: " + filterType + ", bagType: " + bagType
                + ", wandType: " + wandType + "motorSpeedRegulation: " + motorSpeedRegulation + ", cleaningWidth: " + cleaningWidth;
    }
}
