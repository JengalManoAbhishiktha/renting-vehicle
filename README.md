# Vehicle Rental System in Java

## Overview
This project is a Java-based **Vehicle Rental System** that demonstrates core **Object-Oriented Programming (OOP) concepts**, **multithreading**, and **exception handling**. It covers key principles such as:

- **Inheritance**: The base class `VehicleBase` is extended by `Bike` and `Car`.
- **Encapsulation**: The `VehicleDetails` class ensures controlled access to vehicle and user details with validation.
- **Method Overloading**: The `VehicleRentals` class provides multiple `rent` methods with different parameters.
- **Method Overriding**: The `Example` class overrides the `tworents` method from `VehicleRentalBase`.
- **Multithreading**: `RentalThread` and `VehicleCheckThread` simulate concurrent rental processing and vehicle inspections.
- **Exception Handling**: The `VehicleDetails` class validates inputs and throws exceptions for incorrect values.

## Features
- Rent **two-wheeler and four-wheeler vehicles**.
- Maintain user details securely with **encapsulation and validation**.
- Simulate **rental processing and vehicle checks using multithreading**.
- Handle invalid inputs gracefully with **exception handling**.
- Display vehicle types using **inheritance**.
- Demonstrate **method overloading** for different rental options.
- Showcase **method overriding** in rental processing.

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Multithreading
- Exception Handling

## Class Breakdown
### 1. **VehicleBase (Parent Class)**
   - Method `vehi()`: Prints "vehicle".
   - Extended by `Bike` and `Car` classes.

### 2. **Bike and Car (Child Classes)**
   - `Bike` class: Method `bi()` prints "It is a bike".
   - `Car` class: Method `ca()` prints "It is a car".

### 3. **VehicleDetails (Encapsulation & Validation)**
   - Private attributes: `name`, `vehicle_r`, `amt`.
   - Getters and setters with input validation.
   - Throws `IllegalArgumentException` for invalid data.

### 4. **VehicleRentals (Method Overloading)**
   - `rent(int x)`: Prints "Renting a two-wheeler vehicle".
   - `rent(int a, int b)`: Prints "Renting a two-wheeler and a four-wheeler vehicle".
   - `rent(double c)`: Prints "Renting a four-wheeler vehicle".

### 5. **VehicleRentalBase (Method Overriding)**
   - Methods: `tworents()` and `threerents()`.
   - `Example` class overrides `tworents()` to display custom message.

### 6. **Multithreading Classes**
   - `RentalThread` (Extends `Thread`)
     - Simulates a rental processing delay.
   - `VehicleCheckThread` (Implements `Runnable`)
     - Simulates a vehicle inspection delay.

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


