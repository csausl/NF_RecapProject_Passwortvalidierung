import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void mainTest() {
    //GIVEN

    //THEN

    //WHEN
    }

    @Test
    @DisplayName("hasMinLength True Wenn 9")
    void hasMinLength_shouldReturnTrue_WhenLenghtIs9() {
        //GIVEN
        String password = "abcdefkli";
        //boolean expected = true;
        //THEN
        boolean actual = Main.hasMinLength(password, 8);
        //WHEN
        //assertEquals(expected, actual);
        assertTrue(actual);
    }

    @Test
    void hasMinLength_shouldReturnTrue_WhenLenghtIs8() {
        //GIVEN
        String password = "abcdefkl";
        boolean expected = true;
        //THEN
        boolean actual = Main.hasMinLength(password, 8);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void hasMinLength_shouldReturnFalse_WhenLenghtIs7() {
        //GIVEN
        String password = "abcdefk";
        boolean expected = false;
        //THEN
        boolean actual = Main.hasMinLength(password, 8);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void hasMinLength_shouldReturnFalse_WhenLenghtIs0() {
        //GIVEN
        String password = "";
        boolean expected = false;
        //THEN
        boolean actual = Main.hasMinLength(password, 8);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void hasMinLength_shouldReturnFalse_WhenStringIsNull() {
        //GIVEN
        String password = null;
        boolean expected = false;
        //THEN
        boolean actual = Main.hasMinLength(password, 8);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_ShouldReturnTrue_WhenStringIsABCD1() {
        //GIVEN
        String password = "ABCD1";
        boolean expected = true;
        //THEN
        boolean actual = Main.containsDigit(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsDigit_ShouldReturnTrue_WhenStringIs1ABCD() {
        //GIVEN
        String password = "1ABCD";
        boolean expected = true;
        //THEN
        boolean actual = Main.containsDigit(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsDigit_ShouldReturnTrue_WhenStringIs7ABCD() {
        //GIVEN
        String password = "7ABCD";
        boolean expected = true;
        //THEN
        boolean actual = Main.containsDigit(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsDigit_ShouldReturnTrue_WhenStringIs12345678() {
        //GIVEN
        String password = "12345678";
        boolean expected = true;
        //THEN
        boolean actual = Main.containsDigit(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsDigit_ShouldReturnTrue_WhenStringIsAB0D() {
        //GIVEN
        String password = "AB0D";
        boolean expected = true;
        //THEN
        boolean actual = Main.containsDigit(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsDigit_ShouldReturnFalse_WhenStringIsABCD() {
        //GIVEN
        String password = "ABCD";
        boolean expected = false;
        //THEN
        boolean actual = Main.containsDigit(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_shouldReturnFalse_WhenStringIsA() {
        //GIVEN
        String password = "A";
        boolean expected = false;
        //THEN
        boolean actual = Main.containsUpperAndLower(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsUpperAndLower_shouldReturnFalse_WhenStringIsABCD() {
        //GIVEN
        String password = "ABCD";
        boolean expected = false;
        //THEN
        boolean actual = Main.containsUpperAndLower(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsUpperAndLower_shouldReturnFalse_WhenStringIsabcd() {
        //GIVEN
        String password = "abcd";
        boolean expected = false;
        //THEN
        boolean actual = Main.containsUpperAndLower(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsUpperAndLower_shouldReturnFalse_WhenStringIsEmpty() {
        //GIVEN
        String password = "";
        boolean expected = false;
        //THEN
        boolean actual = Main.containsUpperAndLower(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsUpperAndLower_shouldReturnFalse_WhenStringIsNull() {
        //GIVEN
        String password = null;
        boolean expected = false;
        //THEN
        boolean actual = Main.containsUpperAndLower(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void containsUpperAndLower_shouldReturnTrue_WhenStringIsaB() {
        //GIVEN
        String password = "aB";
        boolean expected = true;
        //THEN
        boolean actual = Main.containsUpperAndLower(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword_shouldReturnTrue_WhenPasswordIspassword() {
        //GIVEN
        String password = "password";
        boolean expected = true;
        //THEN
        boolean actual = Main.isCommonPassword(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword_shouldReturnTrue_WhenPasswordIsPasswort1() {
        //GIVEN
        String password = "Passwort1";
        boolean expected = true;
        //THEN
        boolean actual = Main.isCommonPassword(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword_shouldReturnTrue_WhenPasswordIs12345678() {
        //GIVEN
        String password = "12345678";
        boolean expected = true;
        //THEN
        boolean actual = Main.isCommonPassword(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword_shouldReturnTrue_WhenPasswordIsAa345678() {
        //GIVEN
        String password = "Aa345678";
        boolean expected = true;
        //THEN
        boolean actual = Main.isCommonPassword(password);
        //WHEN
        assertEquals(expected, actual);
    }
    @Test
    void isCommonPassword_shouldReturnTrue_WhenPasswordIsNeuefische1() {
        //GIVEN
        String password = "Neuefische1";
        boolean expected = true;
        //THEN
        boolean actual = Main.isCommonPassword(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "Passwort12!, !@#$%^&*()-_+=?.,;:",
            "h7ll@0weLt, !@#$%^&*()-_+=?.,;:",
            "Abc1d&efg, !@#$%^&*()-_+=?.,;:",
    })
    void containsSpecialChar_ShouldReturnTrue_WhenStringContainsAllowedChar(String password, String allowed) {
    //GIVEN
    boolean expected = true;
    //THEN
    boolean actual = Main.containsSpecialChar(password, allowed);
    //WHEN
    assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "Passwort12, !@#$%^&*()-_+=?.,;:",
            "h7ll0weLt, !@#$%^&*()-_+=?.,;:",
            "Abc1defg, !@#$%^&*()-_+=?.,;:",
            "A<bc1de>fg, !@#$%^&*()-_+=?.,;:",
    })
    void containsSpecialChar_ShouldReturnFalse_WhenStringDoesNotContainAllowedChar(String password, String allowed) {
        //GIVEN
        boolean expected = false;
        //THEN
        boolean actual = Main.containsSpecialChar(password, allowed);
        //WHEN
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "Passw!ort12",
            "h7ll0w(eLt",
            "Abc1defg#",
    })
    void isValid_shouldReturnTrue_WhenPasswordIsOnTrueExampleList(String pw) {
        //GIVEN
        boolean expected = true;
        //THEN
        boolean actual = Main.isValid(pw);
        //WHEN
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "Abc1def",
            "Abcdefgh",
            "abcdefg1",
            "ABCDEFG1",
            "Passwort1",

    })
    void isValid_shouldReturnFalse_WhenPasswordIsOnFalseExampleList(String pw) {
        //GIVEN
        boolean expected = false;
        //THEN
        boolean actual = Main.isValid(pw);
        //WHEN
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "password",
            "Passwort1",
            "12345678",
            "Aa345678",
            "Neuefische1"
    })
    void isValid_shouldReturnFalse_WhenPasswordIsOnCommonList(String pw) {
        //GIVEN
        boolean expected = false;
        //THEN
        boolean actual = Main.isValid(pw);
        //WHEN
        assertEquals(expected, actual);
    }


    // Check Hilfsmethoden
    @Test
    void isNotNullOrEmpty_ShouldReturnFalse_WhenPasswortIsA(){
        //GIVEN
        String password = "A";
        boolean expected = false;
        //THEN
        boolean actual=Main.isNullOrEmpty(password);
        //WHEN
        assertEquals(expected, actual);
    }

    // Check Hilfsmethoden
    @Test
    void isNotNullOrEmpty_ShouldReturnTrue_WhenPasswortIsEmpty(){
        //GIVEN
        String password = "";
        boolean expected = true;
        //THEN
        boolean actual=Main.isNullOrEmpty(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void isNotNullOrEmpty_ShouldReturnFalse_WhenPasswortIsNull(){
        //GIVEN
        String password = null;
        boolean expected = true;
        //THEN
        boolean actual=Main.isNullOrEmpty(password);
        //WHEN
        assertEquals(expected, actual);
    }

    @Test
    void isNotNullOrEmpty_ShouldReturnTrue_WhenPasswortIsBlank(){
        //GIVEN
        String password = "         ";
        boolean expected = true;
        //THEN
        boolean actual=Main.isNullOrEmpty(password);
        //WHEN
        assertEquals(expected, actual);
    }
}