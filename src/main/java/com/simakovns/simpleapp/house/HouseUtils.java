package com.simakovns.simpleapp.house;

public class HouseUtils {
    public static void print(final House house) {
        System.out.println("Address " + house.getAddress() + "; Cost: " + house.cost);
        System.out.println("Color: " + house.color);
        System.out.println("Current owner: " + house.currentOwner);
    }
}
