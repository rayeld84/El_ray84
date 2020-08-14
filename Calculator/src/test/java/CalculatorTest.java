import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition(){

        Calculator calc = new Calculator();

        int x = 10;
        int y = 20;

        int calculatorSum = calc.addTwoDoubles(x, y);


        Assert.assertEquals(30, calculatorSum);
        
    }
}
