package by.tc.task01.service.creation.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.creation.CreatorCommand;

import java.util.Map;

import static by.tc.task01.service.transformation.Transformator.doubleTransformator;
import static by.tc.task01.service.transformation.Transformator.stringTransformator;

public class VacuumCleanerCreator implements CreatorCommand {
    @Override
    public Appliance execute(Map<String, String> properties) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        vacuumCleaner.setPowerConsumption(doubleTransformator(properties.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())));
        vacuumCleaner.setFilterType(stringTransformator(properties.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())));
        vacuumCleaner.setBagType(stringTransformator(properties.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())));
        vacuumCleaner.setWandType(stringTransformator(properties.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())));
        vacuumCleaner.setMotorSpeedRegulation(doubleTransformator(properties.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())));
        vacuumCleaner.setCleaningWidth(doubleTransformator(properties.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())));

        return vacuumCleaner;
    }
}
