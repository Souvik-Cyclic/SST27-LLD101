package repository;

public class SqlOrderRepository implements OrderRepository {
    @Override
    public void store(double total) {
        System.out.println("Order stored in SQL DB with total: " + total);
    }
}
