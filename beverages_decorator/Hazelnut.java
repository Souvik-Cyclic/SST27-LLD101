package beverages_decorator;

public class Hazelnut extends AddOnDecorator {
    public Hazelnut(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 500;
    }
}
