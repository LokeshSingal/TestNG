package org.sayem.testng.annotation.test.before.after;

import org.testng.annotations.*;

/**
 * Created by syed.sayem on 6/7/15.
 */

public class TestClass extends BaseClass{
    @BeforeClass
    public void beforeChildClass(){
        System.out.println("Child Before Class method");
    }

    @AfterClass
    public void afterChildClass(){
        System.out.println("Child After Class method");
    }

    @BeforeMethod
    public void beforeChildMethod(){
        System.out.println("Child Before method");
    }

    @AfterMethod
    public void afterChildMethod(){
        System.out.println("Child After method");
    }

    @Test
    public void testMethod(){
        System.out.println("Test method under TestClass");
    }
}