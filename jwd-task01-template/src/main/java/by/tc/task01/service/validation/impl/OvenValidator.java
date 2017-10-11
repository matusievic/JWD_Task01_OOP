package by.tc.task01.service.validation.impl;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.ValidatorCommand;

import java.util.Map;

public class OvenValidator implements ValidatorCommand<SearchCriteria.Oven> {
    @Override
    public boolean execute(Map<SearchCriteria.Oven, Object> criteria) {
        try {
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Oven.POWER_CONSUMPTION, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Oven.WEIGHT, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Oven.CAPACITY, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Oven.DEPTH, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Oven.HEIGHT, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Oven.WIDTH, "0").toString());
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
