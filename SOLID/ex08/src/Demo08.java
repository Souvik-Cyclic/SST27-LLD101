// public class Demo08 {
//     public static void main(String[] args) {
//         Vehicle v = new Bicycle();
//         v.startEngine(); // crash
//     }
// }

public class Demo08 {
    public static void main(String[] args) {
        EngineVehicle car = new Car();
        car.startEngine();

        PedalVehicle bicycle = new Bicycle();
        bicycle.pedal(50);

        ElectricVehicle ev = new Car();
        ev.recharge(100);
    }
}
