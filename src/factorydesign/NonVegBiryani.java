package factorydesign;

public class NonVegBiryani implements Food{

    @Override
    public void createFood() {
        System.out.println("non veg biryani food created");
    }
}
