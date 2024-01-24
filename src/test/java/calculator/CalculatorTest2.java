package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest2 {

    private Calculator calculator = new Calculator();

@Test
    public void checkDiv() {
        Assert.assertEquals(calculator.div(6, 3), 2);
    }
@Test
    public void checkMod() {
        Assert.assertEquals(calculator.mod(8, 4), 0);
    }

}




