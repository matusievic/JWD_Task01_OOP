package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.creation.ApplianceDirector;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        // you may add your own code here
        Set<Map.Entry<E, Object>> entrySet = criteria.getEntrySet();
        try (Scanner appliancesDB = new Scanner(new File("src/main/resources/appliances_db.txt"))) {
            while (appliancesDB.hasNextLine()) {
                String currentLine = appliancesDB.nextLine();
                if (!currentLine.contains(criteria.getApplianceType())) {
                    continue;
                }
                boolean isFound = true;
                //looking for each criteria
                for (Map.Entry<E, Object> e : entrySet) {
                    if (!currentLine.contains(e.getKey().toString() + "=" + e.getValue() + ", ") && !currentLine.contains(e.getKey().toString() + "=" + e.getValue() + ";") && !currentLine.contains(e.getKey().toString() + "=" + e.getValue() + "\n")) {
                        isFound = false;
                        break;
                    }
                }
                //if an appropriate appliance was found, return it
                if (isFound) {
                    Map<String, String> properties = new HashMap<>();
                    String[] parsedInformation = currentLine.split(" : |, |\t|;");
                    for (int i = 1; i < parsedInformation.length; i++) {
                        String[] property = parsedInformation[i].split("=");
                        properties.put(property[0], property[1]);
                    }
                    return ApplianceDirector.getCommand(parsedInformation[0]).execute(properties);
                }
            }
        } catch (IOException e) {
            return null;
        }

        return null;
    }

    // you may add your own code here
}


//you may add your own new classes