package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.driver;

public class ProductDetailsPage {

    @FindBy (xpath = "//input[@id='quantity']")
    public WebElement quantityProduct;

    @FindBy (xpath = "//button[@type='button']")
    public WebElement addCartButton;

    @FindBy (xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement viewCartButton;

    public ProductDetailsPage(){
        PageFactory.initElements(driver, this);
    }
}


