package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.Set;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[@class = 'services-new__list']")
    WebElement mainMenu;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMainMenu(String name) {
        Set<String> oldWindowsSet = BaseSteps.getDriver().getWindowHandles();
        mainMenu.findElement(By.xpath("//*[text() = '" + name + "']")).click();
        String newWindowHandle = (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(new ExpectedCondition<String>() {
                           public String apply(WebDriver driver) {
                               Set<String> newWindowsSet = driver.getWindowHandles();
                               newWindowsSet.removeAll(oldWindowsSet);
                               return newWindowsSet.size() > 0 ?
                                       newWindowsSet.iterator().next() : null;
                           }
                       }
                );
        BaseSteps.getDriver().switchTo().window(newWindowHandle);
    }

}
