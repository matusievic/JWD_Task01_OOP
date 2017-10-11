package by.tc.task01.service.validation.impl;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.ValidatorCommand;

import java.util.Map;

public class TabletPCValidator implements ValidatorCommand<SearchCriteria.TabletPC> {
    @Override
    public boolean execute(Map<SearchCriteria.TabletPC, Object> criteria) {
        try {
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.TabletPC.BATTERY_CAPACITY, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.TabletPC.DISPLAY_INCHES, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.TabletPC.MEMORY_ROM, "0").toString());
            Double.parseDouble(criteria.getOrDefault(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY, "0").toString());
            if (criteria.getOrDefault(SearchCriteria.TabletPC.COLOR, "") == null) { return false; }
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
