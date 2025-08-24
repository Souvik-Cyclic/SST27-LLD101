public class ExpressShipping implements ShippingType {
    @Override
    public double calculateCost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}
