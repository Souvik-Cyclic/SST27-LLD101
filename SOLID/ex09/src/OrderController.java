// public class OrderController {
//     void create(String id){
//         SqlOrderRepository repo = new SqlOrderRepository(); // hard dependency
//         repo.save(id);
//         System.out.println("Created order: " + id);
//     }
// }

public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void create(String id) {
        orderRepository.save(id);
        System.out.println("Created order: " + id);
    }
}
