package steps;

import pages.ElectronicPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps {

    @Step("выполнено нажатие на кнопку - {0} на странице Электроники")
    public void selectButtonFromLeft(String item) {
        new ElectronicPage().selectElectronicLeftMenu(item);
    }
}
