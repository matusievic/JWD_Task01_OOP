package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		// you may add your own code here
		if (criteria == null || criteria.getEntrySet().isEmpty()) { return false; }
		return ApplianceValidator.validate(criteria.getApplianceType()).execute(criteria.getCriteria());
	}
}

//you may add your own new classes