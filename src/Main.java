public class Main {
    public static void main(String[] args) {
        System.out.println("--- Connecting Devices to Standard Power Outlets ---");

        // 1. Laptop via Adapter
        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        laptopOutlet.plugIn();

        // 2. Refrigerator via Adapter
        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);
        fridgeOutlet.plugIn();

        // 3. Smartphone Charger via Adapter
        SmartphoneCharger charger = new SmartphoneCharger();
        PowerOutlet phoneOutlet = new SmartphoneAdapter(charger);
        phoneOutlet.plugIn();
    }
}
