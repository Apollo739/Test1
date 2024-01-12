package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void checkSumm() {
        Assert.assertEquals(calculator.summ(4, 6), 10);
    }

    @Test
    public void checkMunis() {
        Assert.assertEquals(calculator.minus(6, 4), 2);
    }

    @Test
    public void checkMult() {
        Assert.assertEquals(calculator.mult(6, 4), 24);
    }
}
