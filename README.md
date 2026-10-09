# adapter-pattern-lab3

Plugging Devices into Power Outlets

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

Adaptee Objects:

Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.

Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.

SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

Target Object:

PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

Adapter Objects:

LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().

RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().

SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().

Here is how you can set up and structure your GitHub repository for this Adapter Design Pattern project, along with a ready-to-use README.md file.

Step 1: Recommended Repository Structure
Organize your files in your GitHub repository like this:

Plaintext
adapter-pattern-demo/
│
├── README.md
└── src/
    ├── Main.java
    ├── PowerOutlet.java
    ├── Laptop.java
    ├── LaptopAdapter.java
    ├── Refrigerator.java
    ├── RefrigeratorAdapter.java
    ├── SmartphoneCharger.java
    └── SmartphoneAdapter.java
Step 2: Create a README.md for GitHub
Copy and paste the markdown below into your repository's README.md file. It includes the problem description, class breakdown, and the UML class diagram.

Markdown
# Adapter Design Pattern - Power Outlet Example

This project demonstrates the **Adapter Design Pattern** in Java. The adapter pattern allows objects with incompatible interfaces to work together by wrapping an existing class with a new interface.

## Problem Statement & Overview
We have various household devices (such as a Laptop, Refrigerator, and Smartphone Charger) that need to connect to standard power outlets. However, their native connection methods do not match the standard `PowerOutlet` interface. 

Using the Adapter pattern, we create adapter classes (`LaptopAdapter`, `RefrigeratorAdapter`, `SmartphoneAdapter`) that implement the `PowerOutlet` interface and translate the standard calls into the specific methods required by each device.

---

## UML Class Diagram

```mermaid
classDiagram
    class PowerOutlet {
        <<interface>>
        +plugIn()
    }
    class Laptop {
        +charge()
    }
    class Refrigerator {
        +startCooling()
    }
    class SmartphoneCharger {
        +chargePhone()
    }
    class LaptopAdapter {
        -Laptop laptop
        +LaptopAdapter(Laptop laptop)
        +plugIn()
    }
    class RefrigeratorAdapter {
        -Refrigerator refrigerator
        +RefrigeratorAdapter(Refrigerator refrigerator)
        +plugIn()
    }
    class SmartphoneAdapter {
        -SmartphoneCharger smartphoneCharger
        +SmartphoneAdapter(SmartphoneCharger smartphoneCharger)
        +plugIn()
    }
    class Main {
        +main(String[] args)
    }

    PowerOutlet <|.. LaptopAdapter
    PowerOutlet <|.. RefrigeratorAdapter
    PowerOutlet <|.. SmartphoneAdapter
    LaptopAdapter --> Laptop
    RefrigeratorAdapter --> Refrigerator
    SmartphoneAdapter --> SmartphoneCharger
    Main --> LaptopAdapter
    Main --> RefrigeratorAdapter
    Main --> SmartphoneAdapter
