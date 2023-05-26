package shopdi;

public class GroceryShop implements Shop{
    Product products;
    public GroceryShop(Product products)
    {
        this.products=products;
    }
    @Override
    public void getShopType() {
        System.out.println("SHOP TYPE IS GROCERY");
    }

    @Override
    public void getProducts() {
             products.getProductType();
    }
}
