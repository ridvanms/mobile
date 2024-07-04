package com.example.lib;

public class MyClass {

    public static void main(String[] args){



    }
}
class car{
    int year;
    int speed;

    void accelerate(){
        speed += 10;
    }
    void breaking(){
        speed -= 5;
    }
    String showSpeed(){
        return "The speed is " +speed;
    }

}