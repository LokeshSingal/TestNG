package org.sayem.testng.annotation.test;

import org.testng.annotations.Test;

/**
 * Created by syed.sayem on 6/7/15.
 */

@Test
public class TestClass {

    public void testMethodOne(){
        System.out.println("Test method one.");
    }

    public void testMethodTwo(){
        System.out.println("Test method two.");
    }

    private void testMethodThree(){
        System.out.println("Test method three.");
    }
}
