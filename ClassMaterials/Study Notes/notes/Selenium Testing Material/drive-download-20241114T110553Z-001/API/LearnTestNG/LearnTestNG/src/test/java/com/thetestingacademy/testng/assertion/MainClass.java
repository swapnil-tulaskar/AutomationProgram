package com.thetestingacademy.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainClass {

    @Test
    void HardAssertions(){
        System.out.println("After");
        Assert.assertEquals(1,2);
//        Assert.assertNotEquals(1,2);
        System.out.println("Before");
    }

    @Test
    void SoftAssertions(){
        System.out.println("After");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2);
        System.out.println("Before");
        softAssert.assertAll();

    }
}
