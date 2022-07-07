package com.insider.test;

import com.insider.pages.CareersPage;
import com.insider.pages.HomePage;
import com.insider.pages.QualityAssurancePage;
import com.insider.utilities.InsiderDriver;
import com.insider.utilities.InsiderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomaPageTest extends TestBase {
    CareersPage crpgs = new CareersPage();
    HomePage hmp = new HomePage();
    QualityAssurancePage qapge = new QualityAssurancePage();

    @Test

/**  Visit https://useinsider.com/ and check Insider home page is opened or not   */

    public void homePageTest() {
        String expectedUrl = "https://useinsider.com/";
        InsiderUtils.waitFor(2);
        String actualUrl = InsiderDriver.get().getCurrentUrl();
        Assert.assertTrue(actualUrl.equals(expectedUrl));


/** Select “More” menu in navigation bar, select “Careers” and check Career page,  */

        InsiderUtils.navigateToCommonMenu("More");
        InsiderUtils.waitFor(2);
        InsiderUtils.clickWithJS(hmp.careersLink);

/** its Locations block is opened or not     */
        InsiderUtils.scrollToElement(crpgs.ourLocationsTextElement);
        InsiderUtils.waitFor(2);
        String ourLocationSection = InsiderDriver.get().findElement(By.xpath(crpgs.ourLocationsText)).getText();
        System.out.println(ourLocationSection);
        Assert.assertEquals(ourLocationSection, "Our Locations");

        InsiderUtils.scrollToElement(crpgs.informationSection);
        String informationSection = InsiderDriver.get().findElement(By.xpath(crpgs.information)).getText();
        System.out.println(informationSection);
        Assert.assertTrue(informationSection.equals("25 offices across 5 continents, home to 600+ Insiders"));


        /**Life at Insider block is opened or not */
        InsiderUtils.scrollToElement(crpgs.lifeAtInsiderWeb);
        String lifeAtInsiderSection = InsiderDriver.get().findElement(By.xpath(crpgs.lifeAtInsider)).getText();
        System.out.println(lifeAtInsiderSection);
        Assert.assertTrue(lifeAtInsiderSection.equals("Life at Insider"));


        /**Teams block is opened or not */
        InsiderUtils.scrollToElement(crpgs.findYourCallingWeb);
        String findYourCallingSection = InsiderDriver.get().findElement(By.xpath(crpgs.findYourCalling)).getText();
        System.out.println(findYourCallingSection);
        Assert.assertTrue(findYourCallingSection.equals("Find your calling"));


    /**Click “See All Teams”, select Quality Assurance, click “See all QA jobs”, filter jobs by
     Location - Istanbul, Turkey and department - Quality Assurance, check presence of
     jobs list */

        InsiderUtils.clickWithJS(crpgs.seeAllTeams);
        InsiderUtils.clickWithJS(crpgs.qualityAssurance);
        InsiderUtils.clickWithJS(qapge.seeAllQaJobs);

        Select stateDropdown = new Select(qapge.filterLocation);
        stateDropdown.selectByVisibleText("Istanbul, Turkey");
        Select stateDropdown2 = new Select(qapge.filterDepartment);
        stateDropdown2.selectByVisibleText("Quality Assurance");
        InsiderUtils.waitFor(2);


        String[] list = {"Quality Assurance", "Istanbul, Turkey"};

        for (int i = 0; i < list.length; i++) {
            List<String> jobList = InsiderUtils.getElementsText(qapge.listOfCheckJob);
            for (String allInformation : jobList) {
                Assert.assertTrue(allInformation.contains(list[i]));
            }
        }

        for (int i = 0; i < qapge.listOfApplyButton.size(); i++) {

            Assert.assertTrue(qapge.listOfApplyButton.get(i).getAttribute("textContent").contains("Apply Now"));
        }

        InsiderUtils.clickWithJS(qapge.applyNowButton);
        String expectedUrl1 = "https://jobs.lever.co/useinsider/";
        InsiderUtils.switchToWindowWithIndex(1);
        String actualUrl1  = InsiderDriver.get().getCurrentUrl();
        InsiderUtils.waitFor(2);
        System.out.println(actualUrl);
        Assert.assertTrue(actualUrl1.contains(expectedUrl1));

    }
}