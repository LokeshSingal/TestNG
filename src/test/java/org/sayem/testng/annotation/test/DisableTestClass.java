package org.sayem.testng.annotation.test;

import org.testng.annotations.Test;

/**
 * Created by syed.sayem on 6/7/15.
 */

public class DisableTestClass {

    @Test(enabled=true)
    public void testMethodOne(){
        System.out.println("Test method one.");
    }

    @Test(enabled=false)
    public void testMethodTwo(){
        System.out.println("Test method two.");
    }

    @Test
    public void testMethodThree(){
        System.out.println("Test method three.");
    }
}
