package by.tms.loggerandtest.test;

import by.tms.loggerandtest.constant.Constant;
import by.tms.loggerandtest.entity.User;
import by.tms.loggerandtest.service.CalculatorService;
import by.tms.loggerandtest.service.UserService;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @Test
    public void calTestCheckForSum() {
        CalculatorService calcService = new CalculatorService();
        Double result = calcService.calculator(1, 2, Constant.SUM,
                new User("MyName", "easyLogin", "easyPassword"));
        assertEquals("Test passed", result.doubleValue(), 5.0);
    }

    @Test
    public void calTestCheckForDifference() {
        CalculatorService calcService = new CalculatorService();
        Double result = calcService.calculator(1, 2, Constant.MIN,
                new User("MyName", "easyLogin", "easyPassword"));
        assertEquals("Test passed", result.doubleValue(), 5);
    }

    @Test
    public void multiplicationCheck() {
        CalculatorService calcService = new CalculatorService();
        Double result = calcService.calculator(1, 2, Constant.MULT,
                new User("MyName", "easyLogin", "easyPassword"));
        assertEquals("Test passed", result.doubleValue(), 5.0);
    }

    @Test
    public void divisionTest() {
        CalculatorService calcService = new CalculatorService();
        Double result = calcService.calculator(1, 2, Constant.DIV,
                new User("MyName", "easyLogin", "easyPassword"));
        assertEquals("Test passed", result.doubleValue(), 5.0);
    }

    @Test
    public void addUser() {
        UserService userService = new UserService();
        boolean boolAdd = userService.add(new User("MyName", "easyLogin", "easyPassword"));
        assertEquals("Test passed", boolAdd, false);
    }

}
