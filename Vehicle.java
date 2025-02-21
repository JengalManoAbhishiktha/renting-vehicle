// Inheritance
class VehicleBase {
    void vehi() {
        System.out.println("vehicle");
    }
}

class Bike extends VehicleBase {
    void bi() {
        System.out.println("It is a bike");
    }
}

class Car extends VehicleBase {
    void ca() {
        System.out.println("It is a car");
    }
}

// Encapsulation
class VehicleDetails {
    private String name;
    private String vehicle_r;
    private int amt;

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle_r(String vehicle_r) {
        this.vehicle_r = vehicle_r;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public String getVehicle_r() {
        return vehicle_r;
    }

    public int getAmt() {
        return amt;
    }
}

// Overloading
class VehicleRentals {
    void rent(int x) {
        System.out.println("Renting a two-wheeler vehicle");
    }

    void rent(int a, int b) {
        System.out.println("Renting a two-wheeler and a four-wheeler vehicle");
    }

    void rent(double c) {
        System.out.println("Renting a four-wheeler vehicle");
    }
}

// Overriding
class VehicleRentalBase {
    void tworents() {
        System.out.println("Two-wheeler rent");
    }

    void threerents() {
        System.out.println("Three-wheeler rent");
    }
}

class Example extends VehicleRentalBase {
    @Override
    void tworents() {
        System.out.println("Two-wheeler (overridden)");
    }
}

// Main method
public class Vehicle {
    public static void main(String args[]) {
        // Inheritance demonstration
        Bike b = new Bike();
        Car c = new Car();
        b.bi();
        b.vehi();
        c.ca();
        c.vehi();

        // Encapsulation demonstration
        VehicleDetails v = new VehicleDetails();
        v.setName("Ravi");
        v.setVehicle_r("Car");
        v.setAmt(1000);
        System.out.println(v.getName());
        System.out.println(v.getVehicle_r());
        System.out.println(v.getAmt());

        // Overloading demonstration
        VehicleRentals s = new VehicleRentals();
        s.rent(1000);
        s.rent(1001, 1002);
        s.rent(1400.0);

        // Overriding demonstration
        VehicleRentalBase l = new VehicleRentalBase();
        l.tworents();
        l.threerents();
        Example r = new Example();
        r.tworents();
    }
}
