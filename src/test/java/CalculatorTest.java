import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest{
    private Main calculator;

    @Before
    public void setUp() { calculator = new Main(); }

    @Test
    public void test_add_pos(){
        double a = 1.0;
        double b = 2.0;
        double expected_res = 3.0;
        Assert.assertEquals(expected_res,calculator.add(a,b),0.001);
    }
    @Test
    public void test_add_neg(){
        double a = 1;
        double b = 2;
        double expected_res = 10;
        Assert.assertNotEquals(expected_res,calculator.add(a,b));
    }
}