package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePage{

    @FindBy(xpath = "//ul[@class = 'services-new__list']")
    WebElement mainMenu;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMainMenu(String name) {
        mainMenu.findElement(By.xpath("//*[text() = '" + name + "']")).click();
    }

}
