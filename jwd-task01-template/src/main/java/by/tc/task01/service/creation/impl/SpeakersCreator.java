package by.tc.task01.service.creation.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.creation.CreatorCommand;

import java.util.Map;

import static by.tc.task01.service.transformation.Transformator.doubleTransformator;
import static by.tc.task01.service.transformation.Transformator.stringTransformator;

public class SpeakersCreator implements CreatorCommand {
    @Override
    public Appliance execute(Map<String, String> properties) {
        Speakers speakers = new Speakers();

        speakers.setPowerConsumption(doubleTransformator(properties.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())));
        speakers.setNumberOfSpeakers(doubleTransformator(properties.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())));
        speakers.setFrequencyRange(stringTransformator(properties.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())));
        speakers.setCordLength(doubleTransformator(properties.get(SearchCriteria.Speakers.CORD_LENGTH.toString())));

        return speakers;
    }
}
