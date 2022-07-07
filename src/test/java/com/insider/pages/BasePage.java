package com.insider.pages;


import com.insider.utilities.InsiderDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {


    public BasePage() {

        PageFactory.initElements(InsiderDriver.get(), this);
    }

}




