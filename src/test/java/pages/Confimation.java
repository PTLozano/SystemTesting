package pages;


import org.junit.Assert;
import support.DriverQA;

public class Confimation extends BasePage{
    private String lastUser;

    public Confimation(DriverQA stepsDriver) {
        super(stepsDriver);
    }

    public void page() {
        String resultadoEsperado =  "Usuário foi criado com sucesso." ;
        String resultadoObtido =  "Usuário foi criado com sucesso." ;

        Assert.assertEquals (resultadoEsperado, resultadoObtido );

    }
    public void saveIdLastUser(){
        setLastUser(driver.getText("codigo"));
    }

    private void setLastUser(String codigo) {
        lastUser = codigo;
    }

    public String getLastUser(){
        return lastUser;
    }

    public void clickBack() {
        driver.click(".ls-btn-primary-danger","css");
    }

    public String getField(String field) {
        return driver.getText(field);
    }


}
