package org.sayem.testng.packages.test;

import org.testng.annotations.Test;

/**
 * Created by syed.sayem on 6/7/15.
 */
public class RegularExpClass {

    @Test
    public void includeTestFirst(){
        System.out.println("First include test method");
    }

    @Test
    public void includeTestSecond(){
        System.out.println("Second include test method");
    }

    @Test
    public void excludeTestFirst(){
        System.out.println("First exclude test method");
    }

    @Test
    public void excludeTestSecond(){
        System.out.println("Second exclude test method");
    }

    @Test
    public void includeMethod(){
        System.out.println("Include method");
    }

    @Test
    public void excludeMethod(){
        System.out.println("Exclude method");
    }
}
