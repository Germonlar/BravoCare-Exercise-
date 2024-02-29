package steps;

import utils.CommonMethods;

public class ProductsSteps extends CommonMethods {

    public void selectProduct(){
        scrollDown(1500);
        click(productsPage.product);
    }
}
