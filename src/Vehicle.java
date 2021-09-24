abstract public class Vehicle {

    String name;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    void go(Vehicle vehicle) {
        System.out.println("This "+name+ "is moving now");
    }
}
