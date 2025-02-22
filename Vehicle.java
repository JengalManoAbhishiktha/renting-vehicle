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

// Encapsulation with validation
class VehicleDetails {
    private String name;
    private String vehicle_r;
    private int amt;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setVehicle_r(String vehicle_r) {
        if (vehicle_r == null || vehicle_r.isEmpty()) {
            throw new IllegalArgumentException("Vehicle type cannot be empty");
        }
        this.vehicle_r = vehicle_r;
    }

    public void setAmt(int amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
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

// Multithreading - Rental processing thread
class RentalThread extends Thread {
    private String customer;
    private int rentalAmount;

    public RentalThread(String customer, int rentalAmount) {
        this.customer = customer;
        this.rentalAmount = rentalAmount;
    }

    @Override
    public void run() {
        try {
            System.out.println(customer + " is processing the rental...");
            Thread.sleep(2000); // Simulate processing delay
            System.out.println(customer + " rental processed for $" + rentalAmount);
        } catch (InterruptedException e) {
            System.out.println("Rental process interrupted for " + customer);
        }
    }
}

// Multithreading - Vehicle check thread
class VehicleCheckThread implements Runnable {
    private String vehicleType;

    public VehicleCheckThread(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void run() {
        try {
            System.out.println("Checking vehicle: " + vehicleType);
            Thread.sleep(1500); // Simulate checking delay
            System.out.println(vehicleType + " check completed successfully.");
        } catch (InterruptedException e) {
            System.out.println("Vehicle check interrupted for " + vehicleType);
        }
    }
}

// Main class
public class Vehicle {
    public static void main(String args[]) {
        // Inheritance demonstration
        Bike b = new Bike();
        Car c = new Car();
        b.bi();
        b.vehi();
        c.ca();
        c.vehi();

        // Encapsulation demonstration with exception handling
        try {
            VehicleDetails v = new VehicleDetails();
            v.setName("Ravi");
            v.setVehicle_r("Car");
            v.setAmt(1000);
            System.out.println(v.getName());
            System.out.println(v.getVehicle_r());
            System.out.println(v.getAmt());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

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

        // Multithreading demonstration
        System.out.println("\nStarting rental processing and vehicle checks...");
        RentalThread rent1 = new RentalThread("Ravi", 1000);
        RentalThread rent2 = new RentalThread("Amit", 1200);
        Thread checkBike = new Thread(new VehicleCheckThread("Bike"));
        Thread checkCar = new Thread(new VehicleCheckThread("Car"));

        rent1.start();
        rent2.start();
        checkBike.start();
        checkCar.start();

        try {
            rent1.join();
            rent2.join();
            checkBike.join();
            checkCar.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Rental process completed.");
    }
}
