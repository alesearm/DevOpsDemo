package ch.zhaw.iwi.devops.Sonar.SimpleOperationTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ch.zhaw.iwi.devops.Sonar.SimpleOperation;

public class SimpleOperationTest {
    @Test
    public void testDoubleNumber() {
        SimpleOperation operation = new SimpleOperation();
        assertEquals(4, operation.doubleNumber(2), "Doubling 2 should return 4");
        assertEquals(10, operation.doubleNumber(5), "Doubling 5 should return 10");
    }
}