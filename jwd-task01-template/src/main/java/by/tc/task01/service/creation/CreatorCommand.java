package by.tc.task01.service.creation;

import by.tc.task01.entity.Appliance;

import java.util.Map;

public interface CreatorCommand {
    Appliance execute(Map<String, String> properties);
}
