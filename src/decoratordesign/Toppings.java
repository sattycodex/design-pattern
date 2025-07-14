package decoratordesign;

public abstract class Toppings implements Pizza {
    Pizza pizza;
    Toppings(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost();
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }
}
