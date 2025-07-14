package decoratordesign;

public class FarmHouse implements Pizza{
    @Override
    public String getDescription() {
        return "FarmHouse pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
