package by.khadasevich.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"1f", "3", "3.2"})
    void isPositiveNumberTrue(String value) {
        assertTrue(StringUtils.isPositiveNumber(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-1.2", "-1f"})
    void isPositiveNumberFalse(String value) {
        assertFalse(StringUtils.isPositiveNumber(value));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", " ", " 3", "string"})
    void isPositiveNumberException(String value) {
        //IllegalArgumentException is parent class of NumberFormatException
        //This assertion will pass
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.isPositiveNumber(value);
        });

    }
}