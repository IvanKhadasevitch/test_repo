package by.khadasevich.utils;

import static org.apache.commons.lang3.math.NumberUtils.createDouble;
import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (isCreatable(str)) {
            Double number = createDouble(str);
            return number > 0;
        } else {
            throw new IllegalArgumentException("Not a number format");
        }
    }
}
