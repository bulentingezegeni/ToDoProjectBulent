package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import utilities.Driver;

public class NotCriticalFunctionsSteps {

    HomePage homePage=new HomePage();

    @Then("user verifies Done has no {string}")
    public void user_Verifies_Done_Has_No(String string) {
        Driver.wait(1);
        Assert.assertTrue(!homePage.doneElements.getText().contains(string));
    }

    @Given("user clicks on checkbox of given {string}")
    public void user_clicks_on_checkbox_of(String string) {
        homePage.doneElements.click();
    }

    @Then("user verifies {string} is unchecked")
    public void user_Verifies_Is_Unchecked(String string) {
        Driver.wait(3);
        Assert.assertTrue(homePage.uncheckedToDo.getText().contains(string));
    }

    @Then("user verifies page is {string} page")
    public void user_Verifies_Page_Is_Page(String string) {
        Driver.wait(2);
        Assert.assertEquals(homePage.pageHeader.getText(),string);
    }
}
