package factorydesign;

public class NonVegFoodFactory implements FoodFactory{
    Food getNonVegFood(String fooditem){
        if(fooditem.equals("non veg biryani"))return new VegBiryani();
        //else if(fooditem.equals("soya chaap"))return new Soyachaap();
        return null;

    }
    @Override
    public void createFood(String foodItem) {
        Food vegfood=getNonVegFood(foodItem);
        if(vegfood==null) System.out.println(foodItem +" not found");
        else vegfood.createFood();
    }
}
