package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicPage extends BasePage{

    public ElectronicPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[@data-tid = 'cb168a42']")
    public WebElement electronicLeftMenu;

    @FindBy(xpath = "//*[text() = 'Телевизоры']")
    public WebElement buttonTV;

    public void selectElectronicLeftMenu(String name) {
        electronicLeftMenu.findElement(By.xpath("//*[text() = '" + name + "']")).click();
    }


}
