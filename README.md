# Vehicle Rental System in Java

## Overview
This project is a Java-based **Vehicle Rental System** that demonstrates core **Object-Oriented Programming (OOP) concepts**, **multithreading**, and **exception handling**. It covers key principles such as:

- **Inheritance** (Vehicle hierarchy: `VehicleBase`, `Bike`, `Car`)
- **Encapsulation** (Secure data access with `VehicleDetails` class)
- **Method Overloading** (Different ways to rent vehicles in `VehicleRentals`)
- **Method Overriding** (Polymorphic behavior in `Example` class)
- **Multithreading** (Simulated vehicle rental and checking process using `RentalThread` and `VehicleCheckThread`)
- **Exception Handling** (Validation for incorrect inputs)

## Features
- Rent **two-wheeler and four-wheeler vehicles**.
- Maintain user details with **encapsulation and validation**.
- Simulate **rental processing and vehicle checks using multithreading**.
- Handle invalid inputs gracefully with **exception handling**.

## Technologies Used
- Java
- OOP Principles
- Multithreading
- Exception Handling

## How to Run
### Prerequisites:
Ensure you have the following installed:
- Java Development Kit (JDK 8 or later)
- A Java IDE (IntelliJ IDEA, Eclipse, or VS Code) or a command-line terminal

### Steps:
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/vehicle-rental-system.git
   ```
2. Navigate to the project directory:
   ```sh
   cd vehicle-rental-system
   ```
3. Compile the Java program:
   ```sh
   javac Vehicle.java
   ```
4. Run the program:
   ```sh
   java Vehicle
   ```

## Example Output
```
It is a bike
vehicle
It is a car
vehicle
Ravi
Car
1000
Renting a two-wheeler vehicle
Renting a two-wheeler and a four-wheeler vehicle
Renting a four-wheeler vehicle
Two-wheeler rent
Three-wheeler rent
Two-wheeler (overridden)

Starting rental processing and vehicle checks...
Ravi is processing the rental...
Amit is processing the rental...
Checking vehicle: Bike
Checking vehicle: Car
Bike check completed successfully.
Car check completed successfully.
Ravi rental processed for $1000
Amit rental processed for $1200
Rental process completed.
```
