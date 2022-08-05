package com.sparta.om;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyStringsTest {
    @Test
    @DisplayName("Given Palindrome, return true")
    void givenPalindromeReturnTrue () {
        boolean expected = true;
        String answer = "racecar";
        MyStrings stringsObj = new MyStrings();
        Assertions.assertEquals(expected, stringsObj.isPalindrome(answer));
    }
    @Test
    @DisplayName("Given not Palindrome, return false")
    void givenNotPalindromeReturnFalse () {
        boolean expected = false;
        String answer = "rainbow";
        MyStrings stringsObj2 = new MyStrings();
        Assertions.assertEquals(expected, stringsObj2.isPalindrome(answer));
    }
}
