package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class CRUDEUserSteps extends BaseSteps {
    private Home home = new Home (driver);
    private MenuPrincipal menu = new MenuPrincipal (driver);
    private UserGrid userGrid = new UserGrid(driver);
    private UserNew userNew = new UserNew(driver);
    private Confimation confimation =   new Confimation (driver);

    @Given("^the is on Agapito Server page$")
    public void theIsOnAgapitoServerPage() {

        home.openPage();
    }

    @And("^the user clicks on user menu$")
    public void theUserClicksOnUserMenu() {
        menu.clickUser();
    }

    @And("^the user clicks on new user button$")
    public void theUserClicksOnNewUserButton() throws InterruptedException {
        userGrid.clickNewUser();
    }

    @And("^the user fill \"([^\"]*)\" with value equal \"([^\"]*)\"$")
    public void theUserFillWithValueEqual(String field, String value) throws Throwable {
        userNew.fill(field, value);

    }

    @When("^the user clicks on save button$")
    public void theUserClicksOnSaveButton() {
        userNew.clicksalvar();
        confimation.saveIdLastUser();
    }

    @Then("^the user should see \"([^\"]*)\" into view user page$")
    public void theUserShouldSeeIntoViewUserPage(String message) throws Throwable {
        confimation.page();

    }

    @And("^the user backs to the user grid$")
    public void theUserBacksToTheUserGrid() {
        confimation.clickBack();
    }

    @When("^the user clicks on show button$")
    public void theUserClicksOnShowButton() {
        userGrid.clickShow(confimation.getLastUser());
    }

    @Then("^the user should see \"([^\"]*)\" with value equal \"([^\"]*)\"$")
    public void theUserShouldSeeWithValueEqual(String field, String value) throws Throwable {
       Assert.assertEquals(value, confimation.getField(field));
    }

    @Given("^the page is on the Agapito server$")
    public void thePageIsOnTheAgapitoServer() {
    }

    @And("^the user clicks on the Processes menu$")
    public void theUserClicksOnTheProcessesMenu() {
    }

    @And("^the user clicks the new process button$")
    public void theUserClicksTheNewProcessButton() {
    }

    @And("^the user fills in \"([^\"]*)\" with a value equal to \"([^\"]*)\"$")
    public void theUserFillsInWithAValueEqualTo(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills in \"([^\"]*)\" with the value equal to \"([^\"]*)\"$")
    public void theUserFillsInWithTheValueEqualTo(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills \"([^\"]*)\" with the same value \"([^\"]*)\"$")
    public void theUserFillsWithTheSameValue(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^select \"([^\"]*)\" option in the \"([^\"]*)\" field$")
    public void selectOptionInTheField(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user clicks the Save button$")
    public void userClicksTheSaveButton() {
    }

    @And("^user clicks on the Edit button$")
    public void userClicksOnTheEditButton() {
    }

    @And("^system displays the screen for Edit Process$")
    public void systemDisplaysTheScreenForEditProcess() {
    }

    @Then("^the user should see \"([^\"]*)\" into view edition page$")
    public void theUserShouldSeeIntoViewEdiçãoPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
