package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria<E> {

    private String applianceType;

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	// you may add your own code here
	public Set<Map.Entry<E,Object>> getEntrySet() {
		return criteria.entrySet();
	}

	public Map<E, Object> getCriteria() {
		return new HashMap<>(criteria);
	}

	public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }
}
