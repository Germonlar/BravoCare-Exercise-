package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {

    @FindBy (xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutButton;
}
