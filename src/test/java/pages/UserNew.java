package pages;

import support.DriverQA;

public class UserNew extends BasePage {

    public UserNew(DriverQA stepsDriver){
        super(stepsDriver);
    }

    public void fill(String field, String value) {
        switch (field) {
            case "login":
                fillLogin(value); break;
            case "fullName":
                fillFullName(value); break;
            case "email":
                fillLEmail(value); break;
            case "age":
                fillLAge(value); break;
        }
    }

    private void fillLAge(String value) {
        driver.sendKeys(value, "#user_age", "css");
    }

    private void fillLEmail(String value) {
        driver.sendKeys(value, "#user_email", "css");
    }

    private void fillFullName(String value) {
        driver.sendKeys(value, "#user_full_name", "css");
    }

    private void fillLogin(String value) {
        driver.sendKeys(value, "#user_login", "css");
    }


    public void clicksalvar() {
        driver.click("#btn-save","css");
    }


}
