package by.tc.task01.service.creation.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.creation.CreatorCommand;

import java.util.Map;

import static by.tc.task01.service.transformation.Transformator.doubleTransformator;

public class OvenCreator implements CreatorCommand {
    @Override
    public Appliance execute(Map<String, String> properties) {
        Oven oven = new Oven();

        oven.setPowerConsumption(doubleTransformator(properties.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())));
        oven.setWeight(doubleTransformator(properties.get(SearchCriteria.Oven.WEIGHT.toString())));
        oven.setCapacity(doubleTransformator(properties.get(SearchCriteria.Oven.CAPACITY.toString())));
        oven.setDepth(doubleTransformator(properties.get(SearchCriteria.Oven.DEPTH.toString())));
        oven.setHeight(doubleTransformator(properties.get(SearchCriteria.Oven.HEIGHT.toString())));
        oven.setWeight(doubleTransformator(properties.get(SearchCriteria.Oven.WEIGHT.toString())));

        return oven;
    }
}
