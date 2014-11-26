package org.test;

import org.testng.ITest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class DataDrivenUsingFactories implements ITest {
    private String name;
    private int age;

    @Factory(dataProvider = "dp")
    public DataDrivenUsingFactories(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Test
    public void testName() {
        assertNotNull(name, "Name validation successful");
    }

    @Test
    public void testAge() {
        assertTrue(age != 0, "Age validation successful");
    }

    @DataProvider
    public static Object[][] dp() {
        return new Object[][] { { "John", 30 }, { "Rambo", 40 } };
    }

    public String getTestName() {
        StringBuilder builder = new StringBuilder();
        builder.append("[name=").append(name).append(", age=").append(age).append("]");
        return builder.toString();
    }
}
