public class Bike extends Vehicle{
    public Bike(String name) {
        super(name);
    }

    void go(Vehicle vehicle) {
        System.out.println("This bike named "+name+ " is moving now");
    }
}
