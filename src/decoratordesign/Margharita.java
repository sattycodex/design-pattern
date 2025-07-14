package decoratordesign;

public abstract class Margharita implements Pizza{

    public String description;
    public int cost;

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
