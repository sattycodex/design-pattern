package factorydesign;

public class VegBiryani implements Food{
    @Override
    public void createFood() {
        System.out.println("veg Biryani food created");
    }
}
