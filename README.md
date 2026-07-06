<h1 align="center">Проект по автоматизации тестирования для компании</h1>
<div align="center">  
<a href="https://egar.ru"><img title="Egar Logo" src="media/logo/egar-logo.png" width="350" alt="Egar Logo"></a>  
</div>  

>**EGAR** — российская IT-компания, специализирующаяся на разработке корпоративного программного обеспечения для крупных организаций и финансовых структур. Портфель продуктов включает системы бизнес-мониторинга, инструменты аналитики и контроля бизнес-процессов в режиме реального времени. Компания представлена в десяти городах России и СНГ.

---

## Содержание
- [Технологии и инструменты](#технологии-и-инструменты)К
- [Покрытый функционал](#покрытый-функционал)
- [Запуск тестов](#запуск-тестов)
- [Allure отчёт](#allure-отчёт)
- [Allure TestOps](#allure-testops)
- [Интеграция с Jira](#интеграция-с-jira)
- [Уведомления в Telegram](#уведомления-в-telegram)
- [Видео прохождения теста](#видео-прохождения-теста)

---

## Технологии и инструменты

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.java.com)
[![Gradle](https://img.shields.io/badge/Gradle-8-blue)](https://gradle.org)
[![JUnit5](https://img.shields.io/badge/JUnit-5-green)](https://junit.org/junit5/)
[![Selenide](https://img.shields.io/badge/Selenide-7.16.2-blue)](https://selenide.org)
[![Selenoid](https://img.shields.io/badge/Selenoid-remote-lightgrey)](https://aerokube.com/selenoid/)
[![Allure](https://img.shields.io/badge/Allure-2.34.0-orange)](https://allurereport.org)

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
| `BASE_URL` | Адрес сайта | https://egar.ru |
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

## [Allure отчет](https://jenkins.autotests.cloud/view/blankFlyleaf_jobs/job/C41-blankflyleaf-unit14/allure/)

### *Основная страница отчёта*

<div align="center">  
<img title="Allure Overview Dashboard" src="media/screenshot/allureReport1.png" width="850" alt="Allure Overview Dashboard">  
</div>  

### *Тест-кейсы*

<div align="center">  
<img title="Allure Tests" src="media/screenshot/allureReport2.png" width="850" alt="Allure Test">  
</div>

### *Графики*

<div align="center">  
<img title="Allure Graphs" src="media/screenshot/allureReport3.png" width="850" alt="Allure Graphs">  
</div>

---

## [Allure TestOps](https://allure.autotests.cloud/project/5104/dashboards)

### *Основная страница*
<p align="center">  
<img title="Allure TestOps main" src="media/screenshot/TestOps.png" width="850" alt="Allure TestOps main">  
</p>

### *Страница кейсов*
<div align="center">  
<img title="Allure TestOps Tests" src="media/screenshot/TestOps2.png" width="850" alt="Allure TestOps Tests">  
</div>

---

## [Интеграция с Jira](https://jira.autotests.cloud/browse/HOMEWORK-1622)

<div align="center">  
<img title="Jira Task" src="media/screenshot/jira.png" width="850" alt="Jira Task">  
</div>


---

## Уведомления в Telegram

<div align="center">  
<img title="Telegram Integration" src="media/screenshot/telegram.png" width="850" alt="Telegram Integration">  
</div>

---

## Видео прохождения теста
<div align="center">
<img title="Selenoid Video" src="media/video/modalWindowValidation.gif" width="550" height="350"  alt="Selenoid Video">   
</div>