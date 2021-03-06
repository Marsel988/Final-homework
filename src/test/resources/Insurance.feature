#language: ru

Функционал: Яндекс

  Сценарий:  Сценарий №1
    * пользователь выбирает пункт "Маркет" главного меню
    * пользователь выбирает пункт "Электроника" из меню на странице Маркета
    * пользователь выбирает пункт "Телевизоры" из левого меню на странице Электроники
    * пользователь переходит на страницу расширенно поиска
    * пользователь заполняет поле Цена от значением "20000" руб.
    * пользователь выбирает производителей:
      | Samsung |
      | LG      |
    * пользователь нажимает на кнопку Показать
    * пользовател проверяет, что количество элементов на странице равно "48"
    * пользователь запоминает первый элемент
    * пользователь вводит запомненное значение
    * пользователь нажимает на кнопку Найти
    * пользователь проверяет значение
