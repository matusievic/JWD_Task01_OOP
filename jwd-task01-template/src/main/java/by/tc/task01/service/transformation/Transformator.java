package by.tc.task01.service.transformation;

/**
 * This is an auxiliary class aimed to correct values from file if it's necessary
 */
public class Transformator {
    private static final double DEFAULT_DOUBLE_VALUE = 0;
    private static String DEFAULT_STRING_VALUE = "";

    public static double doubleTransformator(String stringValue) {
        double result;
        try {
            result = Double.parseDouble(stringValue);
        } catch (NumberFormatException | NullPointerException e) {
            result = DEFAULT_DOUBLE_VALUE;
        }
        return result;
    }

    public static String stringTransformator(String stringValue) {
        return (stringValue != null) ? stringValue : DEFAULT_STRING_VALUE;
    }
}
