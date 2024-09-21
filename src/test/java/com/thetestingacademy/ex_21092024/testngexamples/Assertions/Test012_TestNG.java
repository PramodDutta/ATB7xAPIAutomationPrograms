package com.thetestingacademy.ex_21092024.testngexamples.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test012_TestNG {
    @Test
    public void hardAssertExample() {
        Assert.assertTrue(false); // This will throw an AssertionError and stop execution.
        System.out.println("This line will not be executed.");
    }

    @Test
    public void softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false); // This will not stop execution.
        System.out.println("This line will be executed.");
        softAssert.assertAll(); // This will report all collected errors.
    }
}
