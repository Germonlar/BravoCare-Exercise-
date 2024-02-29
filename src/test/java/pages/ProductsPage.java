package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.CommonMethods.driver;

public class ProductsPage {
    @FindBy(xpath = "//a[@href='/product_details/11']")
    public WebElement product;


    public ProductsPage(){
        PageFactory.initElements(driver, this);
    }
}
