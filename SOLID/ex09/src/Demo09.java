// public class Demo09 {
//     public static void main(String[] args) {
//         new OrderController().create("ORD-1");
//     }
// }


public class Demo09 {
    public static void main(String[] args) {
        OrderRepository orderRepository = new MongoOrderRepository();
        OrderController orderController = new OrderController(orderRepository);
        orderController.create("ORD-1");
    }
}
