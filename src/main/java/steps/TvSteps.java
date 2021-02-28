package steps;

import pages.MainPage;
import pages.TvPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TvSteps {

    @Step("выбран расширенный фильтр")
    public void selectSelectMoreFiltr() {
        new TvPage().buttonFiltrClick();
    }

    @Step("пользователь заполняет поле Цена от значением {0}")
    public void selectPriceFrom(String item) {
        new TvPage().fiilFieldPriceFrom(item);
    }

    @Step("пользователь выбирает производителей")
    public void stepFillField(String field) throws InterruptedException {
        new TvPage().selectProduct(field);
    }

    @Step("пользователь проверяет количество элементов")
    public void check(String field){
        new TvPage().checkTvCount(field);
    }

    @Step("пользователь нажимает на кнопку Показать")
    public void showTV(){
        new TvPage().showButtonClick();
    }

    @Step("пользователь нажимает на кнопку Найти")
    public void search(){
        new TvPage().searchButtonClick();
    }

    @Step("пользователь запоминает первый элемент")
    public void saveFirstTv(){
        new TvPage().saveTV();
    }

    @Step("пользователь вводит запомненное значение")
    public void inputSaveTv(){
        new TvPage().headerSearchFill();
    }

    @Step("пользователь проверяет значение")
    public void checkTV(){
        new TvPage().checkIsTvTrue();
    }


}
