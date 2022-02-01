package com.simakovns.simpleapp.house;

public class House {
    private final String address;
    private final int numberOfLevels;

    public String currentOwner = "";
    public String color = "";
    public double cost;
    public boolean hasElectricity = false;
    public boolean isSold = false;

    public House(final String address, final int numberOfLevels, final int initialCost) {
        this.address = address;
        this.numberOfLevels = numberOfLevels;
        this.cost = initialCost;
    }

    public void buyHouse(final int cost, final String newOwner) {
        this.cost = cost;
        this.currentOwner = newOwner;
        this.isSold = true;
    }

    public void makeRepairs(final int costOfRepairs) {
        increaseCost(costOfRepairs);
    }

    public void provideElectricity(final int costOfElectricity) {
        increaseCost(costOfElectricity);
        this.hasElectricity = true;
    }

    public void recolorHouse(final int costOfRecolor, final String newColor) {
        increaseCost(costOfRecolor);
        this.color = newColor;
    }

    private void increaseCost(final int additionalCost) {
        this.cost += additionalCost;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfLevels() {
        return numberOfLevels;
    }
}
