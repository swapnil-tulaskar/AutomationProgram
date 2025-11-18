package com.thetestingacademy.testng.TestNGGroups;

import com.aventstack.extentreports.testng.listener.ExtentIReporterSuiteClassListenerAdapter;
import com.thetestingacademy.testng.Listener.CustomListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Groups{

    @Test(groups = "sanity")
    @Description("Test Description: Sanity")
    public void sanityRun(){
        System.out.println("Sanity");
    }
    @Test(groups = {"reg","sanity","e2e"})
    @Description("Test Description: Reg")
    public void RegRun(){
        System.out.println("Reg");
    }
    @Test(groups = {"smoke","sanity"})
    @Description("Test Description: Reg & Smoke")
    public void SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

}
