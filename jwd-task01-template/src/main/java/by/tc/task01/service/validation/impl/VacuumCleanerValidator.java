package by.tc.task01.service.validation.impl;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.ValidatorCommand;

import java.util.Map;

public class VacuumCleanerValidator implements ValidatorCommand<SearchCriteria.VacuumCleaner> {
    @Override
    public boolean execute(Map<SearchCriteria.VacuumCleaner, Object> criteria) {
        try {
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION, "0").toString());
            if (criteria.getOrDefault(SearchCriteria.VacuumCleaner.FILTER_TYPE, "") == null) { return false; }
            if (criteria.getOrDefault(SearchCriteria.VacuumCleaner.BAG_TYPE, "") == null) { return false; }
            if (criteria.getOrDefault(SearchCriteria.VacuumCleaner.WAND_TYPE, "") == null) { return false; }
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.VacuumCleaner.CLEANING_WIDTH, "0").toString());
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
