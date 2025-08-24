public class Car implements EngineVehicle, ElectricVehicle {
    @Override
    public void startEngine(){
        System.out.println("Engine started");
    }
    
    @Override
    public void recharge(int kWh){
        System.out.println("Car recharging with " + kWh + " kWh");
    }
}