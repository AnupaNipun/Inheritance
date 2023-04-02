public class Vehicle {
    void drive() {
        System.out.println("Driving");

    }
void vehicleBreak() {
        System.out.println("Break!");
    }
void  reverse() {
    System.out.println("reverse");
   }

}
class Car extends Vehicle {
void motorRacing() {
    System.out.println("Racing!");
   }
}
class ModernCar extends Car {
void flying() {
    System.out.println("flying!");
}
}
class Boat extends Vehicle{
    void surf () {
        System.out.println("surfing");
    }
}
class ModernBoat extends Boat{
    void landRiding(){
        System.out.println("Ridding");
    }
}
class TestOutput {
    public static void main(String[] args) {
        ModernCar nc = new ModernCar();
        nc.drive();
        nc.vehicleBreak();
        nc.reverse();
        nc.motorRacing();
        nc.flying();
        ModernBoat nb = new ModernBoat();
        nb.drive();
        nb.vehicleBreak();
        nb.reverse();
        nb.surf();
        nb.landRiding();

    }
    }
