package com.marthinussenchad;

/**
 * Created by ChadMarthinussen2 on 2019/03/03.
 */
public class Merc implements Vehicle{



    @Override
    public void accelerate() {
        System.out.println("in Mercedes.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("in Mercedes.brake()");

    }

    @Override
    public void steer() {
        System.out.println("in Mercedes.steer()");

    }


}
