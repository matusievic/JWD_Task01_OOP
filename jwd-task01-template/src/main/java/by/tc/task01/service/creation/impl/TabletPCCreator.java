package by.tc.task01.service.creation.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.creation.CreatorCommand;

import java.util.Map;

import static by.tc.task01.service.transformation.Transformator.doubleTransformator;
import static by.tc.task01.service.transformation.Transformator.stringTransformator;

public class TabletPCCreator implements CreatorCommand {
    @Override
    public Appliance execute(Map<String, String> properties) {
        TabletPC tabletPC = new TabletPC();

        tabletPC.setBatteryCapacity(doubleTransformator(properties.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())));
        tabletPC.setDisplayInches(doubleTransformator(properties.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())));
        tabletPC.setMemoryROM(doubleTransformator(properties.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())));
        tabletPC.setFlashMemoryCapacity(doubleTransformator(properties.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())));
        tabletPC.setColor(stringTransformator(properties.get(SearchCriteria.TabletPC.COLOR.toString())));

        return tabletPC;
    }
}
