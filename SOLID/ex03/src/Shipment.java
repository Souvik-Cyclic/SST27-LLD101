// public class Shipment {
//     String type; double weightKg;
//     Shipment(String type, double w){ this.type=type; this.weightKg=w; }
// }

public class Shipment {
    private final ShippingType type;
    private final double weightKg;

    public Shipment(ShippingType type, double weightKg) {
        this.type = type;
        this.weightKg = weightKg;
    }

    public ShippingType getType() {
        return type;
    }

    public double getWeightKg() {
        return weightKg;
    }
}