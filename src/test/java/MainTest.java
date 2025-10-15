import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void mainTest() {
    //GIVEN

    //THEN

    //WHEN
    }

    @Test
    void hasMinLength_shouldReturnTrue_WhenLenghtIs9() {
        //GIVEN
        String password = "abcdefkli";
        boolean expected = true;
        //THEN
        boolean actual = Main.hasMinLength(password, 8);
        //WHEN
        assertEquals(expected, actual);
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
    void isCommonPassword() {
    }

    @Test
    void containsSpecialChar() {
    }

    @Test
    void isValid() {
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