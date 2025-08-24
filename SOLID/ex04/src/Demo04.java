
// public class Demo04 {
//     public static void main(String[] args) {
//         System.out.println(new PaymentService().pay(new Payment("UPI", 499)));
//     }
// }

public class Demo04 {
    public static void main(String[] args) {
        Payment payment = new Payment(new UpiPayment(), 499);
        PaymentService paymentService = new PaymentService();
        System.out.println(paymentService.pay(payment));
    }
}
