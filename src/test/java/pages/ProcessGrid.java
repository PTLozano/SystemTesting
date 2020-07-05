package pages;

import org.openqa.selenium.By;
import support.DriverQA;

public class ProcessGrid extends BasePage {

    public ProcessGrid(DriverQA stepsDriver){

        super(stepsDriver);
    }

    public void clickNewProcess() {
        driver.click("btn-novo");
    }

    public String getcode(String code) {
        return driver.getText("codigo_" + code);
    }

    public String getFieldvalue(String field, String lastCode) {
        return driver.getText(field + "_" + lastCode);
    }

    public void clickConfirmDelete() {
        driver.ChooseOkOnNextConfirmation();
    }

    public boolean existProcess(String lastCode) {
        String idName = "btn-delete_" + lastCode;
        return driver.getDriver().getPageSource().contains(idName);
    }

    public void clickDelete(String lastCode) {
        String IdName = "#btn-delete_" + lastCode + " a";
        driver.click(IdName, "css");
    }
}
