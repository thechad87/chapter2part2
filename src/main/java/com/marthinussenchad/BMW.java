package com.marthinussenchad;

/**
 * Created by ChadMarthinussen2 on 2019/03/03.
 */
public class BMW implements Vehicle {



    @Override
    public void accelerate() {
        System.out.println("in BMW.accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("in BMW.Brake()");


    }

    @Override
    public void steer() {

        System.out.println("in BMW.steer()");


    }
}
