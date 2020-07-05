package pages;

import support.DriverQA;

public class UserGrid extends BasePage {

    public UserGrid(DriverQA stepDriver){
        super(stepDriver);
    }

    public void clickNewUser() throws InterruptedException {
 //       Thread.sleep(2000);
        driver.click("#btn-new","css");
    }

    public void clickShow(String lastUser) {
        String idName = "btn-show_" + lastUser;
        driver.click(idName);
    }
}
