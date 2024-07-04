package com.example.lib;

public class MyClass {

    public static void main(String[] args){

        //className object = new className();
        Car redCar = new Car();
        redCar.speed = 150;
        redCar.year = 2020;
        redCar.accelerate();
        redCar.brake();
        String speedTxt = redCar.showSpeed();

        System.out.println(speedTxt);
    }
}
class Car{
    int year;
    int speed;

    void accelerate(){
        speed += 10;
    }
    void brake(){
        speed -= 5;
    }
    String showSpeed(){
        return "The speed is " +speed;
    }

}