package by.tc.task01.service.validation.impl;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.ValidatorCommand;

import java.util.Map;

public class SpeakersValidator implements ValidatorCommand<SearchCriteria.Speakers> {
    @Override
    public boolean execute(Map<SearchCriteria.Speakers, Object> criteria) {
        try {
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Speakers.POWER_CONSUMPTION, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS, "0").toString());
            if (criteria.getOrDefault(SearchCriteria.Speakers.FREQUENCY_RANGE, "") == null) { return false; }
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Speakers.CORD_LENGTH, "0").toString());
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
