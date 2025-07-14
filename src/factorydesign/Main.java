package factorydesign;

public class Main {
    public static void main(String[] args) {
        FoodFactory factory=new VegFoodFactory();
        factory.createFood("soya chaap");
    }
}
