package steps;

import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    public static void logToApplication() {
        sendText(ConfigReader.getPropertyValue("username"),loginPage.usernameField);
        sendText(ConfigReader.getPropertyValue("password"),loginPage.passwordField);
        click(loginPage.loginButton);
    }
}
