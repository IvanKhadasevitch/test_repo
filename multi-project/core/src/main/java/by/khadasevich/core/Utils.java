package by.khadasevich.core;

import by.khadasevich.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String element : str) {
            if (!StringUtils.isPositiveNumber(element)) {
                return false;
            }
        }
        return true;
    }
}
