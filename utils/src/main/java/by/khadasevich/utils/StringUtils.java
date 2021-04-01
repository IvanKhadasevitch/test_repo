package by.khadasevich.utils;

import static org.apache.commons.lang3.math.NumberUtils.*;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (isCreatable(str)) {
            Double number = createDouble(str);
            if (number > 0) {
                return true;
            }
        }
        return false;
    }
}
