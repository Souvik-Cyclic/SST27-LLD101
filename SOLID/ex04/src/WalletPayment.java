public class WalletPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Wallet debit: " + amount;
    }
}
