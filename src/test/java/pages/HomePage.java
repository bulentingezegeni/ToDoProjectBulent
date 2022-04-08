package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='To-Do List']")
    public WebElement pageHeader;

    @FindBy(xpath = "//*[@type='text']")
    public WebElement addTaskBox;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement createButton;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement toDoButton;

    @FindBy(xpath = "//*[@style='display: flex; width: 100%; height: 100%;']")
    public List<WebElement> tasksList;

    @FindBy(xpath = "(//*[@type='button'])[3]")
    public WebElement doneButton;

    @FindBy(xpath = "//*[@class='enable-remove-mode']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//*[@type='button'])[6]")
    public WebElement redDeleteButton;

    @FindBy(xpath = "(//*[@class='confirm-dialog'])[2]")
    public WebElement confirmButton;

    @FindBy(xpath = "//*[text()='Delete All Tasks']")
    public WebElement deleteAllTasksButton;

    @FindBy(xpath = "(//*[@type='button'])[4]")
    public WebElement allButton;

    @FindBy(xpath = "(//*[@viewBox='0 0 24 24'])[12]")
    public WebElement deleteIconOfFirstToDo;

    @FindBy(xpath = "(//*[@style='padding: 8px 0px;'])[2]")
    public WebElement doneElements;

    @FindBy(xpath = "(//*[@style='padding: 8px 0px;'])[1]")
    public WebElement uncheckedToDo;

    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement firstItemOfAll;


}
