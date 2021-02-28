package pages;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class MarketPage extends BasePage {

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//a/*[text() = 'Электроника']")
    WebElement buttonElec;

//    @FindBy(xpath = "//a/*[text() = 'Электроника']/../../..")
//    WebElement buttonElec;

    @FindBy(xpath = "//div[@data-zone-name= 'menu']//div[@role = 'tablist']")
    WebElement marketMenu;

    public void selectMarketMenu(String name) throws InterruptedException {
        Thread.sleep(10);
        marketMenu.findElement(By.xpath(".//*[text() = '" + name + "']")).click();
    }

    public void selectElectronic() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 30);
//        WebElement selectGender = BaseSteps.getDriver().findElement(By.xpath("//a/span[@class= '_3z8GfB4w3a'][text() = 'Электроника']/.."));
        BaseSteps.getDriver().get("https://market.yandex.ru/catalog--elektronika/54440");
//        selectGender.click();
        Thread.sleep(10);
//        buttonElec.click();
    }

}
