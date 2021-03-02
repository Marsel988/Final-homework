package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MarketSteps{

    @Step("выполнено нажатие на кнопку - {0} на странице Маркета")
    public void selectButton(String item) throws InterruptedException {
        new MarketPage().selectMarketMenu(item);
    }

    @Step("выполнено нажатие на кнопку - {}")
    public void selectElectronicButton() throws InterruptedException {
        new MarketPage().selectElectronic();
    }

}
