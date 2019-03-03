package com.marthinussenchad;

/**
 * Created by ChadMarthinussen2 on 2019/03/03.
 */
public class Audi implements Vehicle {



    @Override
    public void accelerate() {
        System.out.println("in Audi.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("in Audi.Brake()");
    }

    @Override
    public void steer() {
        System.out.println("in Audi.steer()");
    }
}
