# Проект по автоматизации тестирования для компании [EGAR](https://egar.ru)

>**EGAR** — российская IT-компания, специализирующаяся на разработке корпоративного программного обеспечения для крупных организаций и финансовых структур. Портфель продуктов включает системы бизнес-мониторинга, инструменты аналитики и контроля бизнес-процессов в режиме реального времени. Компания представлена в десяти городах России и СНГ.

---

## Содержание
- [Технологии и инструменты](#технологии-и-инструменты)
- [Покрытый функционал](#покрытый-функционал)
- [Запуск тестов](#запуск-тестов)
- [Allure отчёт](#allure-отчёт)
- [Allure TestOps](#allure-testops)
- [Интеграция с Jira](#интеграция-с-jira)
- [Уведомления в Telegram](#уведомления-в-telegram)
- [Видео прохождения теста](#видео-прохождения-теста)

---

## Технологии и инструменты

![Java](https://img.shields.io/badge/Java-17-orange)
![Gradle](https://img.shields.io/badge/Gradle-8-blue)
![JUnit5](https://img.shields.io/badge/JUnit-5-green)
![Selenide](https://img.shields.io/badge/Selenide-7.16.2-blue)
![Selenoid](https://img.shields.io/badge/Selenoid-remote-lightgrey)
![Allure](https://img.shields.io/badge/Allure-2.34.0-orange)

---

## Покрытый функционал

| Страница                | Тест-кейс | Тег | Severity |
|-------------------------|---|---|---|
| Карьера                 | Проверка открытия модальной формы «Связаться с нами» | Smoke, Regression | Blocker |
| Карьера                 | Проверка появления валидации модальной формы «Связаться с нами» | Smoke, Regression | Critical |
| Карьера                 | Параметризованная проверка ховеров с заменой заголовка на описание | Regression | Normal |
| О компании              | Проверка перехода на страницу «О компании» и «История» | Regression | Normal |
| Смарт Бизнес-Мониторинг | Проверка PDF-файла в аккордеоне «Функциональные характеристики» | Regression | Normal |
| Смарт Бизнес-Мониторинг | Проверка первого PDF-файла в аккордеоне «Установка» | Regression | Normal |

---

## Запуск тестов

### Локально
```bash
./gradlew test
```

### Запуск по тегам
```bash
./gradlew test -DincludeTags=Smoke
./gradlew test -DincludeTags=Regression
```

### Параметры запуска

| Параметр | Описание | Значение по умолчанию |
|---|---|---|
| `BROWSER` | Браузер | `chrome` |
| `BROWSER_VERSION` | Версия браузера | — |
| `BROWSER_SIZE` | Размер окна | `1920x1080` |
| `BASE_URL` | Адрес сайта | — |
| `SELENOID_URL` | Адрес Selenoid | — |
| `SELENOID_CREDENTIAL` | Логин:пароль Selenoid | — |


### С параметрами (через Jenkins или терминал)
```bash
./gradlew test \
  -DBROWSER=chrome \
  -DBROWSER_VERSION=120.0 \
  -DBROWSER_SIZE=1920x1080 \
  -DBASE_URL=https://egar.ru \
  -DSELENOID_URL=<selenoid-host> \
  -DSELENOID_CREDENTIAL=<user:password>
```

---

## Allure отчёт

_[ скриншот ]_

---

## Allure TestOps

_[ скриншот ]_

---

## Интеграция с Jira

_[ скриншот ]_

---

## Уведомления в Telegram

_[ скриншот ]_

---

## Видео прохождения теста

_[ видео/гиф ]_
