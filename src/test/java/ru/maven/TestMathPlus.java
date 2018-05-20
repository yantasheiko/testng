package src.test.java.ru.maven;

import org.testng.*;
import org.testng.annotations.Test;
import src.main.java.ru.maven.MathPlus;

public class TestMathPlus {

@Test
public void testMethod() throws Exception {
	MathPlus math = new MathPlus();
        Assert.assertEquals(math.plus(1, 1), 5);
}

}
