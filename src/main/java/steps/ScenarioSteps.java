package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import pages.TvPage;

import java.util.List;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    TvSteps tvSteps = new TvSteps();
    BaseSteps baseSteps = new BaseSteps();


    @When("^пользователь выбирает пункт \"(.+)\" главного меню$")
    public void selectMainMenuItem(String name) {
        mainSteps.selectMainMenu(name);
    }

    @When("^пользователь выбирает пункт \"(.+)\" из меню на странице Маркета$")
    public void selectFromMarketMenu(String name) throws InterruptedException {
        marketSteps.selectButton(name);
    }

    @When("^пользователь выбирает пункт \"(.+)\" из левого меню на странице Электроники$")
    public void selectFromElecLeftMenu(String name) {
        electronicSteps.selectButtonFromLeft(name);
    }

    @When("^пользователь нажимает на кнопку Электроника$")
    public void selectFromElecLeftMenu() throws InterruptedException {
        marketSteps.selectElectronicButton();
    }

    @When("^пользователь нажимает на кнопку Показать$")
    public void selectShowButton(){
        tvSteps.showTV();
    }

    @When("^пользователь нажимает на кнопку Найти$")
    public void searchButtonClick(){
        tvSteps.search();
    }

    @When("^пользователь запоминает первый элемент$")
    public void saveFirst(){
        tvSteps.saveFirstTv();
    }

    @When("^пользователь проверяет значение$")
    public void checkTrue(){
        tvSteps.checkTV();
    }

    @When("^пользователь вводит запомненное значение$")
    public void inputFirstTv(){
        tvSteps.inputSaveTv();
    }

    @When("^пользователь переходит на страницу расширенно поиска$")
    public void moreFiltr() {
        tvSteps.selectSelectMoreFiltr();
    }

    @When("^пользователь заполняет поле Цена от значением \"(.*)\" руб.$")
    public void fillPriceField(String item) {
        tvSteps.selectPriceFrom(item);
    }

    @When("^пользовател проверяет, что количество элементов на странице равно \"(.*)\"$")
    public void checkCount(String item) {
        tvSteps.check(item);
    }

    @When("^пользователь выбирает производителей:$")
    public void fillFields(List<String> arg) {
        arg.stream().forEach(field -> {
            try {
                tvSteps.stepFillField(field);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }


}
