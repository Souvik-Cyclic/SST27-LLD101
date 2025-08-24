public class CardPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Charged card: " + amount;
    }
}
