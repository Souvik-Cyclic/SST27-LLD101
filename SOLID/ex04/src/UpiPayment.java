public class UpiPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}
