package at.olb.Project;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator classUnderTest;

    @Before
    public void setUp() throws Exception{
        classUnderTest = new Calculator();
    }

    @Test
    public void testSubtraction(){
        long result = 18 - 12 - 1;
        assertEquals(result, classUnderTest.subtract(18, 12, 1));

        result = 28 - 88;
        assertEquals(result, classUnderTest.subtract(28, 88));

        result = 0;
        assertEquals(result, classUnderTest.subtract(0));
    }

    @Test
    public void testAdd(){
        long result = 10 + 23 + (-16);
        assertEquals(result, classUnderTest.add(10, 23, -16));

        result = 1000 + 27;
        assertEquals(result, classUnderTest.add(1000, 27));

        result = 0;
        assertEquals(result, classUnderTest.add(0));
    }
}
