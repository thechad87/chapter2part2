package com.marthinussenchad;

/**
 * chapter 2 part 2
 * 208031197
 * part time
 * chad marthinussen
 */
public class Driver
{
    public static void main( String[] args )
    {

        Vehicle vehicel = new Merc();
        vehicel.brake();

        Vehicle vehicle1 = new Audi();
        vehicle1.accelerate();

        Vehicle vehicle2 = new BMW();
        vehicle2.steer();


    }
}
