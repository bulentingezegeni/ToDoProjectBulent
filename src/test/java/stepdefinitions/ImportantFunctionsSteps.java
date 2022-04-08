package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import utilities.Driver;

public class ImportantFunctionsSteps {

    HomePage homePage=new HomePage();

    @Then("user verifies To do button has {string}")
    public void user_verifies_to_do_button_has(String string) {
        Driver.wait(2);
        Assert.assertTrue(homePage.toDoButton.getText().contains(string));
    }

    @Given("user clicks on All button")
    public void user_clicks_on_All_button() {
        Driver.waitAndClick(homePage.allButton);
    }

    @Then("user verifies All button has {string}")
    public void user_verifies_All_button_has(String string) {
        Driver.wait(2);
        Assert.assertTrue(homePage.allButton.getText().contains(string));
    }

    @Given("user clicks on first delete icon")
    public void user_clicks_on_first_delete_icon() {
        Driver.waitAndClick(homePage.deleteIconOfFirstToDo);
    }

    @Then("user verifies {string} is deleted")
    public void user_verifies_is_deleted(String string) {
        Driver.wait(3);
        Assert.assertTrue(!homePage.firstItemOfAll.getText().contains(string));
        Driver.wait(2);
    }

    @Given("user clicks on red Delete button")
    public void user_clicks_on_red_delete_button() {
        homePage.redDeleteButton.click();
    }


}
