package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class CriticalFunctionsSteps {

    HomePage homePage=new HomePage();

    @Given("user is on the application page")
    public void user_is_on_the_application_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }

    @Given("user clicks on Add Task text box")
    public void user_clicks_on_add_task_text_box() {
        Driver.clickWithJS(homePage.addTaskBox);
    }

    @Then("user enters a {string}")
    public void user_enters_a(String string) {
        Driver.waitAndSendText(homePage.addTaskBox,string);
    }

    @Then("user verifies create button is enabled")
    public void user_verifies_create_button_is_enabled() {
        Driver.wait(2);
        Assert.assertTrue(homePage.createButton.isEnabled());
    }

    @Then("user clicks on create button")
    public void user_clicks_on_create_button() {
        Driver.clickWithJS(homePage.createButton);
    }

    @Then("user clicks on To Do button")
    public void user_clicks_on_to_do_button() {
        Driver.clickWithJS(homePage.toDoButton);
    }

    @Given("user clicks on checkbox of {string}")
    public void user_clicks_on_checkbox_of(String string) {
        for(WebElement each:homePage.tasksList){
            if(each.getText().contains(string)){
                Driver.clickWithJS(each);
                break;
            }
        }
    }


    @Given("user clicks on Done button")
    public void user_clicks_on_done_button() {
        Driver.waitAndClick(homePage.doneButton);
    }

    @Then("user verifies {string} is displayed")
    public void user_verifies_is_displayed(String string) {
        List<String> tasks=new ArrayList<>();
        for(WebElement each:homePage.tasksList){
            tasks.add(each.getText());
        }
        Driver.wait(3);
        Assert.assertTrue(tasks.contains(string));
    }

    @Given("user clicks on Delete button")
    public void user_clicks_on_delete_button() {
        homePage.deleteButton.click();
    }

    @Given("user clicks on Delete All Tasks button")
    public void user_clicks_on_delete_all_tasks_button() {
        Driver.clickWithJS(homePage.deleteAllTasksButton);
    }

    @Given("user clicks confirm button")
    public void user_clicks_confirm_button() {
        Driver.waitAndClick(homePage.confirmButton);
    }

    @Then("user verifies All tasks are deleted")
    public void user_verifies_All__tasks_are_deleted() {
        Driver.wait(1);
        Assert.assertTrue(homePage.tasksList.size()==0);
    }




}
