package org.sayem.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by syed.sayem on 6/7/15.
 */

public class DataProviderExample {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { "data one" }, { "data two" } };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }

}
