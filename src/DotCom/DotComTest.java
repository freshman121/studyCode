package DotCom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DotComTest {
    DotCom dot;

    @BeforeEach
    void setUp() {
        DotCom dot = new DotCom();
    }

    @AfterEach
    void tearDown() {
        dot = null;
    }

    @Test
    void setLocationCells() {
        DotCom dot = new DotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
    }

    @Test
    void checkYourself1() {
        DotCom dot = new DotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "1";
        String result = dot.checkYourself(userGuess);
    }

    @Test
    void checkYourself2() {
        DotCom dot = new DotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }

    @Test
    void checkYourself3() {
        DotCom dot = new DotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "3";
        String result = dot.checkYourself(userGuess);
    }

    @Test
    void checkYourself4() {
        DotCom dot = new DotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "4";
        String result = dot.checkYourself(userGuess);
    }
}