package shopdi;

import java.sql.SQLOutput;

public class GroceryProducts implements Product{

    @Override
    public void getProductType() {
        System.out.println("GROCERY PRODUCTS");
    }

}
