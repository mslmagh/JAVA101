package OOP;

public class Car {
    // Nitelikler
    String type = "Sedan";
    String model = "Test";
    String color;
    int speed;
    int speedLimit = 180;

    Car(String model, int speed) {
        this.model = model;
        System.out.println(model);
    }

    void increaseSpeed(int increment) {
        if (speed + increment < speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printDpeed() {
        System.out.println(speed);
    }
}