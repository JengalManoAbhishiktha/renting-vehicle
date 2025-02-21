# Vehicle Management System in Java

This project demonstrates key **Object-Oriented Programming (OOP)** concepts in Java, including:

- **Inheritance**: Bike and Car classes inherit properties from a base Vehicle class.
- **Encapsulation**: Vehicle details (name, type, and amount) are managed with getter and setter methods.
- **Method Overloading**: A demonstration of multiple methods with the same name but different parameter lists.
- **Method Overriding**: Child classes override the behavior of parent class methods.

## Table of Contents
1. [Overview](#overview)
2. [Features](#features)
3. [Code Structure](#code-structure)
4. [How to Run](#how-to-run)
5. [Usage](#usage)
6. [OOP Concepts Demonstrated](#oop-concepts-demonstrated)

---

## Overview

The project provides an implementation of a simple Vehicle Management System in Java, showcasing core OOP principles. It includes classes for different types of vehicles and demonstrates inheritance, encapsulation, method overloading, and method overriding.

---

## Features

- **Vehicle Information**: Set and retrieve vehicle details like name, type, and rent amount.
- **Inheritance**: Specialized vehicle types (bike and car) extend from a base vehicle class.
- **Overloading**: Demonstrates renting vehicles with different parameter options.
- **Overriding**: Specialized rental types override default rental messages.

---

## Code Structure

The project includes the following key classes:

1. **VehicleBase**: Base class for all vehicles, providing a basic `vehi()` method.
2. **Bike** and **Car**: Inherit from `VehicleBase` and add their own unique methods.
3. **VehicleDetails**: Encapsulates vehicle details using private fields and public getters/setters.
4. **VehicleRentals**: Demonstrates method overloading with multiple `rent` methods.
5. **VehicleRentalBase** and **Example**: Demonstrates method overriding with customized behavior.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/vehicle-management-system.git
   ```

2. Navigate to the project directory:
   ```bash
   cd vehicle-management-system
   ```

3. Compile the code using `javac`:
   ```bash
   javac Vehicle.java
   ```

4. Run the compiled Java program:
   ```bash
   java Vehicle
   ```

---

## Usage

The program will:
- Print messages demonstrating the inheritance hierarchy.
- Set and retrieve encapsulated vehicle details.
- Demonstrate overloaded methods for renting different types of vehicles.
- Show overridden methods with custom behavior for different rental types.

Sample output:

```plaintext
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
```

---

## OOP Concepts Demonstrated

1. **Inheritance**: The `Bike` and `Car` classes inherit from `VehicleBase`, reusing its methods and adding new functionality.
2. **Encapsulation**: Private fields in `VehicleDetails` are accessed and modified using public getters and setters.
3. **Method Overloading**: The `VehicleRentals` class has multiple `rent` methods with different parameter lists.
4. **Method Overriding**: The `Example` class overrides the `tworents` method from `VehicleRentalBase`.

---
