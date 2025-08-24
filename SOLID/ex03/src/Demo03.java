// public class Demo03 {
//     public static void main(String[] args) {
//         System.out.println(new ShippingCostCalculator().cost(new Shipment("EXPRESS", 2.0)));
//     }
// }

public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(new ExpressShipping(), 2.0);
        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
        System.out.println(shippingCostCalculator.cost(shipment));
    }
}
