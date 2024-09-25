# kotest-examples-allure

## Requirements
- Java 17
- Allure cli

Example project using Kotest, Gradle and Allure https://github.com/allure-framework

Clone this repo, execute:

```
./gradlew check // runs tests
allure generate build/allure-results -o allure-report --clean
 // generates allure html report
allure open allure-reports // launches http server to display html erport
```
