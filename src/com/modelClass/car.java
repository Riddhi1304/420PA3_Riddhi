package com.modelClass;

public class car {
    // Fields
    private String model;
    private int year;
    private boolean isElectric;

    // Constructor
    public car(String model, int year, boolean isElectric) {
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
    }

    // Getter for model
    public String getmodel() {
        return model;
    }

    // Getter for year
    public int getyear() {
        return year;
    }

    // Getter for isElectric
    public boolean isElectric() {
        return isElectric;
    }

}
