package selenium.test.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.pages.DashboardPage;
import selenium.test.project.pages.LoginPage;
import selenium.test.project.utils.BaseProperties;

public class LoginTest extends AbstractTest {

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage = loginPage.fillLoginForm(
                BaseProperties.ADMIN_EMAIL,
                BaseProperties.ADMIN_PASSWORD);

        DashboardPage dashboardPage = loginPage.submitLoginForm();

        Assert.assertTrue(dashboardPage.isLogoutButtonDisplayed());
    }
}
