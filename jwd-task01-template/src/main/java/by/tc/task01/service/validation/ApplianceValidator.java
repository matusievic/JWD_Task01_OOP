package by.tc.task01.service.validation;

import by.tc.task01.service.validation.impl.LaptopValidator;
import by.tc.task01.service.validation.impl.OvenValidator;
import by.tc.task01.service.validation.impl.RefrigeratorValidator;
import by.tc.task01.service.validation.impl.SpeakersValidator;
import by.tc.task01.service.validation.impl.TabletPCValidator;
import by.tc.task01.service.validation.impl.VacuumCleanerValidator;

import java.util.HashMap;
import java.util.Map;

public final class ApplianceValidator {
    private static Map<String, ValidatorCommand> commands = new HashMap<>();

    static {
        commands.put("Laptop", new LaptopValidator());
        commands.put("Oven", new OvenValidator());
        commands.put("Refrigerator", new RefrigeratorValidator());
        commands.put("Speakers", new SpeakersValidator());
        commands.put("TabletPC", new TabletPCValidator());
        commands.put("VacuumCleaner", new VacuumCleanerValidator());
    }

    public static ValidatorCommand validate(String appliance) {
        return commands.get(appliance);
    }
}
