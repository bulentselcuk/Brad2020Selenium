package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestBase {
    protected WebDriver driver=Driver.getDriver ();
    protected WebDriverWait wait=new WebDriverWait ( Driver.getDriver (), 2 );
    private Action action;


    @BeforeMethod
    public void setup() {
        String URL=ConfigurationReader.getProperty ( "url" );
        Driver.getDriver ().get ( URL );
        wait = new WebDriverWait ( Driver.getDriver (), 2 );

    }
    @AfterMethod
    public void tearDown(){
        BrowserUtils.wait ( 2 );
        Driver.closeDriver ();
    }
}
