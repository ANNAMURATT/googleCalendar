package com.anna.step_definitions;

import com.anna.pages.LoginInPage;
import com.anna.utilities.ConfgurationReader;
import com.anna.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefinitions {
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfgurationReader.getProperty("url"));
    }

    @When("user logs in as a student")
    public void user_logs_in_as_a_student() {

    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        String expected = "North American University";
        System.out.println(Driver.getDriver().getTitle());
    }

    @When("user enters {string}")
    public void user_enters(String url) {

        Driver.getDriver().get(ConfgurationReader.getProperty("url"));
    }

    @When("user click to {string}")
    public void user_click_to(String string) {
        LoginInPage loginInPage = new LoginInPage();
        loginInPage.portal.click();
    }

    @Then("page redirected to the sign in page {string}")
    public void page_redirected_to_the_page(String string) throws InterruptedException {
       Thread.sleep(5000);
        LoginInPage loginInPage = new LoginInPage();
        System.out.println(loginInPage.signInTitle.getText());
    }


}
