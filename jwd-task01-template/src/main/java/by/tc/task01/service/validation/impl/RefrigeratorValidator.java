package by.tc.task01.service.validation.impl;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.ValidatorCommand;

import java.util.Map;

public class RefrigeratorValidator implements ValidatorCommand<SearchCriteria.Refrigerator> {
    @Override
    public boolean execute(Map<SearchCriteria.Refrigerator, Object> criteria) {
        try {
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Refrigerator.POWER_CONSUMPTION, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Refrigerator.WEIGHT, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Refrigerator.FREEZER_CAPACITY, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Refrigerator.OVERALL_CAPACITY, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Refrigerator.HEIGHT, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Refrigerator.WIDTH, "0").toString());
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
