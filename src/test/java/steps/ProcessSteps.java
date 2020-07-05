package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessSteps extends BaseSteps {
    private MenuPrincipal menu = new MenuPrincipal(driver);
    private ProcessNew processNew = new ProcessNew(driver);
    private ProcessGrid processGrid = new ProcessGrid(driver);
    private ProcessShow processShow = new ProcessShow(driver);
    private Home home = new Home(driver);

    @Given("^the user is on Agapito Server page$")
    public void theUserIsOnAgapitoServerPage() {
        home.openPage();
    }

    @And("^the user clicks on Process menu$")
    public void theUserClicksOnProcessMenu() {
        menu.clickProcess();
    }

    @And("^the user clicks on new process button$")
    public void theUserClicksOnNewProcessButton() {
        processGrid.clickNewProcess();
    }

    @And("^the user fills \"([^\"]*)\" with value equal \"([^\"]*)\" on the process page$")
    public void theUserFillWithValueEqualOnTheProcessPage(String field, String value) throws Throwable {
        processNew.FillField(field, value);
    }

    @When("^the user clicks on save button on the process page$")
    public void theUserClicksOnSaveButtonOnTheProcessPage() {
        processNew.clickSave();
        processShow.setLastCode();
    }

    @Then("^the user should see \"([^\"]*)\" into view process page$")
    public void theUserShouldSeeIntoViewProcessPage(String message) throws Throwable {
        Assert.assertEquals(message, processShow.getNotice());
    }

    @And("^the user selects urgency with value equal \"([^\"]*)\" on the process page$")
    public void theUserFillSelectsWithValueEqualOnTheProcessPage(String urgency) throws Throwable {
        processNew.selectUrgency(urgency);
    }

    @And("^the user clicks on arbitramento equals \"([^\"]*)\"$")
    public void theUserClicksOnArbitramentoEquals(String res) throws Throwable {
        processNew.clickArbitramento(res);
    }

    @When("^the user clicks on back button into process show page$")
    public void theUserClicksOnBackButtonIntoProcessShowPage() {
        processShow.clickBack();
    }

    @Then("^the user should see last code on the process grid page$")
    public void theUserShouldSeeLastCodeOnTheProcessGridPage() {
        Assert.assertEquals(processShow.getLastCode(), processGrid.getcode(processShow.getLastCode()));
    }

    @And("^the user should see \"([^\"]*)\" with value \"([^\"]*)\" on the process grid page$")
    public void theUserShouldSeeWithValueOnTheProcessGridPage(String field, String value) throws Throwable {
        Assert.assertEquals(value, processGrid.getFieldvalue(field, processShow.getLastCode()));
    }

    @When("^the user clicks on edit button into process show page$")
    public void theUserClicksOnEditButtonIntoProcessShowPage() {
        processShow.clickEdit();
    }

    @Given("^the user backs to the process grid$")
    public void theUserBacksToTheProcessGrid() {
        processShow.clickBack();
    }

    @When("^the user clicks on delete button$")
    public void theUserClicksOnDeleteButton() {
        processGrid.clickDelete(processShow.getLastCode());
    }

    @And("^the user confirms delete$")
    public void theUserConfirmsDelete() {
        processGrid.clickConfirmDelete();
    }

    @Then("^the user should not see last user code$")
    public void theUserShouldNotSeeLastUserCode() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertFalse("Error: There is an process with this code " + processShow.getLastCode(),
                processGrid.existProcess(processShow.getLastCode()));
    }
}
