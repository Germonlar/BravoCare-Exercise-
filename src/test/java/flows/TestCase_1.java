package flows;

import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import utils.CommonMethods;


public class TestCase_1 extends CommonMethods {

    @Test(priority = 1, groups = "smoke")
    public void boughProductTC() throws InterruptedException {

        productsSteps.selectProduct();

        productDetailsSteps.addProduct();




    }


}
