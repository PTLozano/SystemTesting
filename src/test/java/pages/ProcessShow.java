package pages;

import support.DriverQA;

public class ProcessShow extends BasePage {

    private String lastCode;

    public ProcessShow(DriverQA stepsDriver){
        super(stepsDriver);
    }

    public String getNotice() {
        return driver.getText("notice");
    }

    public void clickBack() {
        driver.click(".ls-btn-primary-danger","css");
    }

    public void setLastCode(){
        lastCode = driver.getText("codigo");
    }

    public String getLastCode() {
        return lastCode;

    }

    public void clickEdit() {
        driver.click(".ls-btn", "css");
    }
}
