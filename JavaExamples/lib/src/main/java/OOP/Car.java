package OOP;

public class Car {
    String carModel;
    public Car(String car_model){
        this.carModel = car_model;
    }
    void showTheCarModel(){
        System.out.println("The car model is: " +this.carModel);
    }
}
