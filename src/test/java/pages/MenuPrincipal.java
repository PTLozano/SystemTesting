package pages;
import support.DriverQA;

public class MenuPrincipal extends BasePage{
    public MenuPrincipal(DriverQA stepsDriver){
        super(stepsDriver);
    }

    public void clickUser() {
        driver.click("#users","css");
    }

    public void clickProcess() {
        driver.click("#processos","css");
    }
}
