package by.khadasevich.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("1f"));
        assertTrue(StringUtils.isPositiveNumber("3"));
        assertTrue(StringUtils.isPositiveNumber("3"));

        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-1.2"));
        assertFalse(StringUtils.isPositiveNumber("-1f"));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber(null));
        assertFalse(StringUtils.isPositiveNumber("string"));
    }
}