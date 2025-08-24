public class StandardShipping implements ShippingType {
    @Override
    public double calculateCost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}
