package com.insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class QualityAssurancePage extends BasePage {

    @FindBy(xpath = "//a[@href='https://useinsider.com/careers/open-positions/?department=qualityassurance']")
    public WebElement seeAllQaJobs;

    @FindBy(id = "filter-by-location")
    public WebElement filterLocation;

    @FindBy(id = "filter-by-department")
    public WebElement filterDepartment;

    @FindBy(xpath = "//li[@class='select2-results__option' and text()='Istanbul, Turkey']")
    public WebElement istanbulTurkey;

    @FindBy(xpath = "//li[@id='select2-filter-by-department-result-o7ry-Quality Assurance']")
    public WebElement qualityAssurance;

    public String jobList = "//div[@class='position-list-item col-12 col-lg-4 qualityassurance istanbul-turkey full-timeremote']";

    @FindBy(css = "div[class='position-list-item-wrapper bg-light']")
    public List<WebElement> listOfCheckJob;

    @FindBy (xpath = "//span[@class='position-department text-large font-weight-600 text-primary']")
    public List<WebElement> listOfDepartment;

    @FindBy(css = "div[class='position-location text-large']")
    public List<WebElement> listOfLocation;

    @FindBy(css = "a[class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5']")
    public List<WebElement> listOfApplyButton;

    @FindBy(css = "a[class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5']")
    public WebElement applyNowButton;


}
