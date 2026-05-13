public class Main {
    public static void main(String[] args) {

        Vehicle b = new Bike();
        Vehicle c = new Car();
        Vehicle t = new Truck();

        System.out.println("\n--- BIKE ---");
        b.startEngine();
        b.drive();
        b.honk();

        System.out.println("\n--- CAR ---");
        c.startEngine();
        c.drive();
        c.honk();

        System.out.println("\n--- TRUCK ---");
        t.startEngine();
        t.drive();
        t.honk();
    }
}