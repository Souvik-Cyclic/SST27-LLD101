// public class Payment {
//     String provider; double amount;
//     Payment(String p, double a){ provider=p; amount=a; }
// }

public class Payment {
    private final PaymentMethod paymentMethod;
    private final double amount;

    public Payment(PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public PaymentMethod getMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }
}