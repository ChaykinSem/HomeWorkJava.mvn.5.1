package ru.netology.sqr.javaqa.HomeWorkJavamvn5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.cvs")

    public void testNumberOfSquares(int expected, int ransgeStart, int rangeFinish) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(ransgeStart, rangeFinish);

        Assertions.assertEquals(expected, actual);
    }

}
