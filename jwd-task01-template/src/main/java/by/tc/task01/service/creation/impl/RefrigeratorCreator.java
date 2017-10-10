package by.tc.task01.service.creation.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.creation.CreatorCommand;

import java.util.Map;

import static by.tc.task01.service.transformation.Transformator.doubleTransformator;

public class RefrigeratorCreator implements CreatorCommand {
    @Override
    public Appliance execute(Map<String, String> properties) {
        Refrigerator refrigerator = new Refrigerator();

        refrigerator.setPowerConsumption(doubleTransformator(properties.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())));
        refrigerator.setWeight(doubleTransformator(properties.get(SearchCriteria.Refrigerator.WIDTH.toString())));
        refrigerator.setFreezerCapacity(doubleTransformator(properties.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())));
        refrigerator.setOverallCapacity(doubleTransformator(properties.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())));
        refrigerator.setHeight(doubleTransformator(properties.get(SearchCriteria.Refrigerator.HEIGHT.toString())));
        refrigerator.setWeight(doubleTransformator(properties.get(SearchCriteria.Refrigerator.WEIGHT.toString())));

        return refrigerator;
    }
}
