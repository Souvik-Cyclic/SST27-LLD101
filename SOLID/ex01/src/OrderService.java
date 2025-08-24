// public class OrderService {
//     double taxRate = 0.18;
//     EmailClient email = new EmailClient();

//     double totalWithTax(double subtotal) {
//         return subtotal + subtotal * taxRate;
//     }
//     void checkout(String customerEmail, double subtotal) {
//         double total = totalWithTax(subtotal);
//         email.send(customerEmail, "Thanks! Your total is " + total);
//         System.out.println("Order stored (pretend DB).");
//     }
// }

import notifier.Notifier;
import repository.OrderRepository;
import tax.TaxCalculator;

public class OrderService {
    private final TaxCalculator taxCalculator;
    private final OrderRepository orderRepository;
    private final Notifier notifier;

    public OrderService(TaxCalculator taxCalculator, OrderRepository orderRepository, Notifier notifier) {
        this.taxCalculator = taxCalculator;
        this.orderRepository = orderRepository;
        this.notifier = notifier;
    }

    public void checkout(String customerEmail, double subtotal){
        double total = taxCalculator.totalWithTax(subtotal);
        orderRepository.store(total);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
    }
}