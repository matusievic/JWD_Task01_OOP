package by.tc.task01.service.creation.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.creation.CreatorCommand;

import java.util.Map;

import static by.tc.task01.service.transformation.Transformator.doubleTransformator;
import static by.tc.task01.service.transformation.Transformator.stringTransformator;

public class LaptopCreator implements CreatorCommand {
    @Override
    public Appliance execute(Map<String, String> properties) {
        Laptop laptop = new Laptop();

        laptop.setBatteryCapacity(doubleTransformator(properties.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())));
        laptop.setOs(stringTransformator(properties.get(SearchCriteria.Laptop.OS.toString())));
        laptop.setMemoryROM(doubleTransformator(properties.get(SearchCriteria.Laptop.MEMORY_ROM.toString())));
        laptop.setSystemMemory(doubleTransformator(properties.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())));
        laptop.setCpu(doubleTransformator(properties.get(SearchCriteria.Laptop.CPU.toString())));
        laptop.setDisplayInchs(doubleTransformator(properties.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString())));

        return laptop;
    }
}
