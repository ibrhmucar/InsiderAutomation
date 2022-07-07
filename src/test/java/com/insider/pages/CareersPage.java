package com.insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage extends BasePage {


    @FindBy(xpath = "//h3[@class='category-title-media ml-0']")
    public WebElement ourLocationsTextElement;

    @FindBy(xpath = "//p[@class='mb-0']")
    public WebElement a;

    @FindBy(xpath = "//h2[@class='elementor-heading-title elementor-size-default' and text()='Life at Insider']")
    public WebElement lifeAtInsiderWeb;

    @FindBy(xpath = "//a[@id='wt-cli-accept-all-btn']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//p[@class='mt-5 mb-0 mt-lg-0 mx-auto pl-0']")
    public WebElement informationSection;

    @FindBy(xpath = "(//h3[@class='category-title-media'])[1]")
    public WebElement findYourCallingWeb;

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement seeAllTeams;

    @FindBy(xpath = "//a[@href='https://useinsider.com/careers/quality-assurance/']")
    public WebElement qualityAssurance;

    @FindBy (css = "p[class='mb-0']")
    public List<WebElement> locations;


    public String information = "//p[@class='mt-5 mb-0 mt-lg-0 mx-auto pl-0']";

    public String locationName = "//p[@class='mb-0']";
    public String ourLocationsText = "//h3[@class='category-title-media ml-0']";
    public String lifeAtInsider = "//h2[@class='elementor-heading-title elementor-size-default' and text()='Life at Insider']";

    public String findYourCalling = "(//h3[@class='category-title-media'])[1]";

}



