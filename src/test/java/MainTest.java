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
    void containsDIgit() {
    }

    @Test
    void containsUpperAndLower() {
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

}