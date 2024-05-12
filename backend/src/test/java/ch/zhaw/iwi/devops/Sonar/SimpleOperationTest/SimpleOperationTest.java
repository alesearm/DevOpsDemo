package ch.zhaw.iwi.devops.Sonar.SimpleOperationTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ch.zhaw.iwi.devops.Sonar.SimpleOperation;

public class SimpleOperationTest {
    
    @Test
    public void testclassOperation() {
        SimpleOperation SimpleOperation = new SimpleOperation();
    }

    @Test
    public void testDoubleNumber() {
        int result = SimpleOperation.doubleNumber(2);
        assertEquals(4, result, "Doubling 2 should return 4");

        result = SimpleOperation.doubleNumber(5);
        assertEquals(10, result, "Doubling 5 should return 10");
    }
}