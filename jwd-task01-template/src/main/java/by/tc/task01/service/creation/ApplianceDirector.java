package by.tc.task01.service.creation;

import by.tc.task01.service.creation.impl.LaptopCreator;
import by.tc.task01.service.creation.impl.OvenCreator;
import by.tc.task01.service.creation.impl.RefrigeratorCreator;
import by.tc.task01.service.creation.impl.SpeakersCreator;
import by.tc.task01.service.creation.impl.TabletPCCreator;
import by.tc.task01.service.creation.impl.VacuumCleanerCreator;

import java.util.HashMap;
import java.util.Map;

public final class ApplianceDirector {
    private static Map<String, CreatorCommand> commands = new HashMap<>();

    static {
        commands.put("Laptop", new LaptopCreator());
        commands.put("Oven", new OvenCreator());
        commands.put("Refrigerator", new RefrigeratorCreator());
        commands.put("Speakers", new SpeakersCreator());
        commands.put("TabletPC", new TabletPCCreator());
        commands.put("VacuumCleaner", new VacuumCleanerCreator());
    }

    public static CreatorCommand getCommand(String typeName) {
        return commands.get(typeName);
    }
}
