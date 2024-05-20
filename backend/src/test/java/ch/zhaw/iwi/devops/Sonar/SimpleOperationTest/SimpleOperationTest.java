package ch.zhaw.iwi.devops.Sonar.SimpleOperationTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ch.zhaw.iwi.devops.Sonar.SimpleOperation;

public class SimpleOperationTest {

    @Test
    public void testDoubleNumber() {
        int result = SimpleOperation.doubleNumber(2);
        assertEquals(4, result, "Doubling 2 should return 4");

        result = SimpleOperation.doubleNumber(5);
        assertEquals(10, result, "Doubling 5 should return 10");

        // Zusätzliche Testfälle
        result = SimpleOperation.doubleNumber(-3);
        assertEquals(-6, result, "Doubling -3 should return -6");

        result = SimpleOperation.doubleNumber(0);
        assertEquals(0, result, "Doubling 0 should return 0");
    }

    // Neue Tests für die tripleNumber-Methode
    @Test
    public void testTripleNumber() {
        int result = SimpleOperation.tripleNumber(2);
        assertEquals(6, result, "Tripling 2 should return 6");

        result = SimpleOperation.tripleNumber(5);
        assertEquals(15, result, "Tripling 5 should return 15");

        result = SimpleOperation.tripleNumber(-3);
        assertEquals(-9, result, "Tripling -3 should return -9");

        result = SimpleOperation.tripleNumber(0);
        assertEquals(0, result, "Tripling 0 should return 0");
    }
}
