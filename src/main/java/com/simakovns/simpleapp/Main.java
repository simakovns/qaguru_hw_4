package com.simakovns.simpleapp;

import com.simakovns.simpleapp.house.House;
import com.simakovns.simpleapp.house.HouseUtils;

/**
 * Entry point of application
 */
public class Main {
    public static void main(String[] args) {
        final House house = new House("Ulitsa Pushkina, Dom 6K",2,1000);
        house.color = "white";
        house.currentOwner = "none";

        HouseUtils.print(house);

        house.recolorHouse(100, "red");
        house.provideElectricity(50);
        house.makeRepairs(500);

        HouseUtils.print(house);

        if (!house.isSold) {
            house.buyHouse(2000, "Mr. Kolotushkin");
        }
        HouseUtils.print(house);
    }
}
