package by.tc.task01.service.validation;

import java.util.Map;

public interface ValidatorCommand<E> {
    boolean execute(Map<E, Object> criteria);
}
