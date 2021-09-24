public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    void go(Vehicle vehicle) {
        System.out.println("This car named "+name+ " is moving now");
    }
}
