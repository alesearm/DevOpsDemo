package ch.zhaw.iwi.devops.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void testclass() {
        Calculator Calc = new Calculator();
    }
    @Test
    public void testAdd2() {
        
        int result = Calculator.add(10, 20);
        assertEquals(30, result, "Die Addition von 10 und 20 sollte 30 ergeben");
    }
}