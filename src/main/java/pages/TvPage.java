package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static steps.BaseSteps.fillField;

public class TvPage extends BasePage {
    public static String tv1;
    public static String tv2;

    public TvPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//span[text() = 'Все фильтры']")
    WebElement buttonFiltr;

    @FindBy(xpath = "//input[@id = 'header-search']")
    WebElement headerSearch;

    @FindBy(xpath = "(//button/h4[contains(text(), 'Цена')]/../..//input[@type = 'text'])[1]")
    WebElement priceFrom;

    @FindBy(xpath = "//*[text() = 'Samsung']")
    WebElement SamsungSelect;

    @FindBy(xpath = "//*[text() = 'LG']")
    WebElement LgSelect;

    @FindBy(xpath = "//article")
    WebElement tvCount;

    @FindBy(xpath = "//div/*[contains(text(), 'Показать')]")
    WebElement showButton;

    @FindBy(xpath = "(//h3//a/span)[1]")
    WebElement firstTvName;

    @FindBy(xpath = "//*[text()= 'Найти']/..")
    WebElement searchButton;

    public void buttonFiltrClick() {
        buttonFiltr.click();
    }

    public void searchButtonClick() {
        searchButton.click();
    }

    public void showButtonClick() {
        showButton.click();
    }

    public void saveTV() {
        tv1 = BaseSteps.getDriver().findElement(By.xpath("(//h3//a)[1]")).getText();
    }

    public void checkIsTvTrue() {
        tv2 = BaseSteps.getDriver().findElement(By.xpath("(//h3//a)[1]")).getText();
        assertEquals(tv1, tv2);
    }

    public void fiilFieldPriceFrom(String item) {
        priceFrom.clear();
        priceFrom.sendKeys(item);
    }

    public void headerSearchFill() {
        headerSearch.clear();
        headerSearch.sendKeys(tv1);
    }

    public void checkTvCount(String item) {
        List<WebElement> list = BaseSteps.getDriver().findElements(By.xpath("//article"));
        int count = Integer.parseInt(item);
        assertTrue(list.size() == count);
    }

    public void selectProduct(String fieldName) throws InterruptedException {
        switch (fieldName) {
            case "Samsung":
                WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 30);
                WebElement selectSamsung = BaseSteps.getDriver().findElement(By.xpath("//*[text() = 'Samsung']"));
                ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("arguments[0].scrollIntoView(true);", selectSamsung);
                Thread.sleep(500);
                selectSamsung.click();
                break;
            case "LG":
                WebDriverWait wait1 = new WebDriverWait(BaseSteps.getDriver(), 30);
                WebElement selectLG = BaseSteps.getDriver().findElement(By.xpath("//*[text() = 'LG']"));
                ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("arguments[0].scrollIntoView(true);", selectLG);
                Thread.sleep(500);
                selectLG.click();
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

}
