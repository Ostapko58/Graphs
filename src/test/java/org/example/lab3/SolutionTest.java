package org.example.lab3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    protected static final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeAll
    static void setOut() {
        System.setOut(new PrintStream(output));
    }


    @Test
    void permutationTest() {
        assertEquals(3024, Solution.permutation(9, 4));
    }

    @Test
    void sterlingTest() {

        Solution.createTable(7);

        String actual = output.toString().replaceAll("\n", "").replaceAll("\r", "");


        String expected = "| n\\k |          1 |          2 |          3 |          4 |          5 |          6 |          7 |          8 |          9 |         10 |         11 |         12 |        F() |" +
                "| 1   |          1 |            |            |            |            |            |            |            |            |            |            |            |          1 |" +
                "| 2   |          1 |          1 |            |            |            |            |            |            |            |            |            |            |          2 |" +
                "| 3   |          1 |          3 |          1 |            |            |            |            |            |            |            |            |            |          5 |" +
                "| 4   |          1 |          7 |          6 |          1 |            |            |            |            |            |            |            |            |         15 |" +
                "| 5   |          1 |         15 |         25 |         10 |          1 |            |            |            |            |            |            |            |         52 |" +
                "| 6   |          1 |         31 |         90 |         65 |         15 |          1 |            |            |            |            |            |            |        203 |" +
                "| 7   |          1 |         63 |        301 |        350 |        140 |         21 |          1 |            |            |            |            |            |        877 |" +
                "| 8   |          1 |        127 |        966 |       1701 |       1050 |        266 |         28 |          1 |            |            |            |            |       4140 |" +
                "| 9   |          1 |        255 |       3025 |       7770 |       6951 |       2646 |        462 |         36 |          1 |            |            |            |      21147 |" +
                "| 10  |          1 |        511 |       9330 |      34105 |      42525 |      22827 |       5880 |        750 |         45 |          1 |            |            |     115975 |" +
                "| 11  |          1 |       1023 |      28501 |     145750 |     246730 |     179487 |      63987 |      11880 |       1155 |         55 |          1 |            |     678570 |" +
                "| 12  |          1 |       2047 |      86526 |     611501 |    1379400 |    1323652 |     627396 |     159027 |      22275 |       1705 |         66 |          1 |    4213597 |";

        assertEquals(expected,actual);
    }
}