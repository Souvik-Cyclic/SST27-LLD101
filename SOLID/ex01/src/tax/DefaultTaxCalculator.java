package tax;

public class DefaultTaxCalculator implements TaxCalculator {
    private final double taxRate;

    public DefaultTaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
