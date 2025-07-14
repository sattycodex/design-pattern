package decoratordesign;

public class OnionDecorator extends Toppings{

    OnionDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" with onion toppings";
    }

    @Override
    public int getCost() {
        return super.getCost() +30;
    }
}
