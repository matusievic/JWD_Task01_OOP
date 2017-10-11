package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
	// you may add your own code here
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }

        Speakers speakers = (Speakers) obj;
        if (powerConsumption != speakers.powerConsumption) { return false; }
        if (numberOfSpeakers != speakers.numberOfSpeakers) { return false; };
        if (!Objects.equals(frequencyRange, speakers.frequencyRange)) { return false; }
        if (cordLength != speakers.cordLength) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        double hash = powerConsumption;
        hash = 31 * hash + numberOfSpeakers;
        hash = 31 * hash + Objects.hashCode(frequencyRange);
        hash = 31 * hash + cordLength;
        return (int) hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + '@' + "powerConsumption: " + powerConsumption + ", numberOfSpeakers: " + numberOfSpeakers
                + ", frequencyRange: " + frequencyRange + ", cordLength: " + cordLength;
    }
}
