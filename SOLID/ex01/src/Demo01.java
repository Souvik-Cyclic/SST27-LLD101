

// public class Demo01 {
//     public static void main(String[] args) {
//         new OrderService().checkout("a@shop.com", 100.0);
//     }
// }

import notifier.EmailNotifier;
import notifier.Notifier;
import repository.OrderRepository;
import repository.SqlOrderRepository;
import tax.DefaultTaxCalculator;
import tax.TaxCalculator;

public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new DefaultTaxCalculator(0.18);
        OrderRepository orderRepository = new SqlOrderRepository();
        Notifier notifier = new EmailNotifier();

        OrderService orderService = new OrderService(taxCalculator, orderRepository, notifier);
        orderService.checkout("a@shop.com", 100.0);
    }
}
