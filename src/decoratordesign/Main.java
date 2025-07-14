package decoratordesign;

public class Main {
    public static void main(String[] args) {

        Pizza margharita=new MediumMargharita();
        System.out.println(margharita.getCost());
        Toppings onionToppings=new OnionDecorator(margharita);
        System.out.println(onionToppings.getCost());
        Toppings cheese=new CheeseDecorator(onionToppings);
        System.out.println(cheese.getDescription());
        System.out.println(cheese.getCost());
    }
}
