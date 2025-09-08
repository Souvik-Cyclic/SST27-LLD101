package beverages_decorator;

public class Chocolate extends AddOnDecorator {
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 100;
    }
}
