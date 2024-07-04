package com.example.lib;

public class MyClass {

    public static void main(String[] args){

        //className object = new className();
        Car redCar = new Car(100,2020);
//        redCar.speed = 150;
//        redCar.year = 2020;
        //using constructor

        redCar.accelerate();
        redCar.brake();
        String speedTxt = redCar.showSpeed();

        System.out.println(speedTxt);
    }
}
class Car{

    int year;
    int speed;

    public Car(int carSpeed,int carYear){
        year = carYear;
        speed = carSpeed;
    }
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