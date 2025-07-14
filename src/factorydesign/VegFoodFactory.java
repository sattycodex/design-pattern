package factorydesign;

public class VegFoodFactory implements FoodFactory{

    Food getVegFood(String fooditem){
        if(fooditem.equals("veg biryani"))return new VegBiryani();
        else if(fooditem.equals("soya chaap"))return new Soyachaap();
        return null;

    }
    @Override
    public void createFood(String foodItem) {
        Food vegfood=getVegFood(foodItem);
        if(vegfood==null) System.out.println(foodItem +" not available. please select another food item");
        else vegfood.createFood();
    }
}
