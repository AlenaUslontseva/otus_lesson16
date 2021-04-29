#language:ru
@test @auth
Функционал: Регистрация на сайте otus.ru
  @positive
  Структура сценария: Вход на сайт otus.ru зарегестированного пользователя (позитивный сценарий)
    Пусть выполнен вход на сайт "https://otus.ru/"
    И пройдена проверка title стартовой страницы
    Когда открылось окно с регистрацией
    И в поле email указан  email зарегистрированного пользователя
    И в поле пароль указан password зарегистрированного пользователя
    И нажата кнопка Войти
    Тогда выполнена проверка появления иконки пользователя

    Примеры:
      | email                   | password |
      | vivoji4103@kindbest.com | 1234Test |
