package pages;

import org.openqa.selenium.chrome.ChromeOptions;
import steps.LoginSteps;
import steps.ProductDetailsSteps;
import steps.ProductsSteps;

public class PageInitializer {
    public static LoginPage loginPage;
    public static LoginSteps loginSteps;
    public static ProductsPage productsPage;

    public static ProductsSteps productsSteps;

    public static ProductDetailsPage productDetailsPage;

    public static ProductDetailsSteps productDetailsSteps;

    public static ShoppingCartPage shoppingCartPage;




    public static void initializePageObjects() {
        loginPage = new LoginPage();
        loginSteps = new LoginSteps();
        productsPage = new ProductsPage();
        productsSteps = new ProductsSteps();
        productDetailsPage = new ProductDetailsPage();
        productDetailsSteps = new ProductDetailsSteps();
        shoppingCartPage = new ShoppingCartPage();



    }
}
