package org.sayem.testng.factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by syed.sayem on 6/7/15.
 */

public class FactoryWithDataProvider {

    private int param;

    @Factory(dataProvider = "dataMethod")
    public FactoryWithDataProvider(int param) {
        this.param = param;
    }

    @DataProvider
    public static Object[][] dataMethod() {
        return new Object[][] { { 0 }, { 1 } };
    }

    @Test
    public void testMethodOne() {
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }

    @Test
    public void testMethodTwo() {
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}
