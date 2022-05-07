package com.company;
import Flugel.Flugel;
import Flugel.Eagle;
import Flugel.Seagull;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Eagle eagle = new Eagle();
        Seagull seagull = new Seagull();


        eagle.fly();
        eagle.eatFood();
        eagle.land();
        eagle.liftOff();


        System.out.println();

        seagull.fly();
        seagull.liftOff();
        seagull.eatFood();
        seagull.land();


    }
}
