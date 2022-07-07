package com.insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

@FindBy (xpath = "//a[@href='https://useinsider.com/careers/']")
    public WebElement careersLink;


}
