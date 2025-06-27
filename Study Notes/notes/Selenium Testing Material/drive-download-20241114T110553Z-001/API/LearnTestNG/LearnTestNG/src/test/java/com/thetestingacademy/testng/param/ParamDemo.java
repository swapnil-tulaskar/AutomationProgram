package com.thetestingacademy.testng.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemo {

    @Parameters("value")
    @Test(priority = 1)
    void demo1(String value){
        System.out.println("Name is " +value);
    }

}
