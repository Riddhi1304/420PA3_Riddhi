package com.modelClass;

public class VehicleClass {
    abstract class Vehicle {
        private String make;
        private String model;
        private int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        // Method to get a description of the vehicle
        public abstract String getDescription();
    }
    class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String make, String model, int year, int numberOfDoors) {
            super(make, model, year);
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public String getDescription() {
            return "Car: " + getMake() + " " + getModel() + " (" + getYear() + "), Doors: " + numberOfDoors;
        }
    }
    class Truck extends Vehicle {
        private double payloadCapacity;

        public Truck(String make, String model, int year, double payloadCapacity) {
            super(make, model, year);
            this.payloadCapacity = payloadCapacity;
        }

        @Override
        public String getDescription() {
            return "Truck: " + getMake() + " " + getModel() + " (" + getYear() + "), Payload Capacity: " + payloadCapacity + " tons";
        }
    }
}
