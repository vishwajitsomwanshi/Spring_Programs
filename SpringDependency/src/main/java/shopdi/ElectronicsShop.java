package shopdi;

public class ElectronicsShop implements Shop
{
    ElectronicsProducts products;

    public ElectronicsShop(ElectronicsProducts products){
        this.products=products;
    }
    @Override
    public void getShopType() {
        System.out.println("SHOP TYPE IS ELECTRONICS");
    }

    @Override
    public void getProducts() {
          products.getProductType();
    }
}
