package com.example.assignment1;

public class Country {
    private String name;
    private int flagImageResourceId;

    public Country(String name, int flagImageResourceId) {
        this.name = name;
        this.flagImageResourceId = flagImageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getFlagImageResourceId() {
        return flagImageResourceId;
    }
}

