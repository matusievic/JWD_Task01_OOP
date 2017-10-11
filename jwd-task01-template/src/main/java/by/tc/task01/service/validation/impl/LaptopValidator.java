package by.tc.task01.service.validation.impl;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.ValidatorCommand;

import java.util.Map;

public class LaptopValidator implements ValidatorCommand<SearchCriteria.Laptop> {
    @Override
    public boolean execute(Map<SearchCriteria.Laptop, Object> criteria) {
        try {
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Laptop.BATTERY_CAPACITY, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Laptop.OS, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Laptop.MEMORY_ROM, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Laptop.SYSTEM_MEMORY, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Laptop.CPU, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.Laptop.DISPLAY_INCHS, "0").toString());
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
