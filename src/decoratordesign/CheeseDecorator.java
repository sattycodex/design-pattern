package decoratordesign;

public class CheeseDecorator extends Toppings{
    CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" with extra chesse";
    }

    @Override
    public int getCost() {
        return super.getCost() +80;
    }
}
