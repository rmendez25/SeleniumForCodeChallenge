package com.demo.testPlans;

import com.demo.qa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.demo.qa.extentreports.ExtentTestManager.startTest;

public class Test01 extends BaseTest {
   // GooglePage googlePage = new GooglePage(getDriver());
    @Test
    public void pass(Method method){
        startTest(method.getName(), "Invalid Login Scenario with invalid username and password.");
        Assert.assertTrue(true);
    }

    @Test
    public void fail(Method method){
        startTest(method.getName(), "Fail Test");
        Assert.fail();
    }
}
