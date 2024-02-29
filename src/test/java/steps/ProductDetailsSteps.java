package steps;

import utils.CommonMethods;

public class ProductDetailsSteps extends CommonMethods {

    public void addProduct(){
        sendInt(5,productDetailsPage.quantityProduct);

        click(productDetailsPage.addCartButton);


        click(productDetailsPage.viewCartButton);

    }

}
