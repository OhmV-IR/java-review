///////////// CURSOR PARKING LOT /////////////
//                                          //
//                                          //
//                                          //
//////////////////////////////////////////////

/*
 * Vehicle (abstract)
 * AirVehicle (abstract)
 * Car
 * Plane
 * RoadVehicle (abstract)
 */

public class Main {
  public static void main(String[] args) {
    Plane plane = new Plane(2008, "Idra", 250);
    plane.IgniteEngine();
    plane.LiftOff();
    plane.ListSpecs();
    Car car = new Car(2016, "Ohm", 4, 5);
    car.IgniteEngine();
    car.ChangeGear(2);
    car.ListSpecs();
  }
}

abstract class RoadVehicle extends Vehicle {
  int buildYear;
  String builderName;
  int numOfTires;
  int numOfSeats;
  abstract void IgniteEngine();
  abstract void ListSpecs();
}

abstract class Vehicle {
  int buildYear;
  String builderName;
  int numOfSeats;
  abstract void IgniteEngine();
  abstract void ListSpecs();
}

class Plane extends AirVehicle{
  Plane(int buildYear, String builderName, int numOfSeats){
    this.buildYear = buildYear;
    this.builderName = builderName;
    this.numOfSeats = numOfSeats;
  }
  int buildYear;
  String builderName;
  int numOfSeats;
  void IgniteEngine(){
    System.out.println("Plane engine ignited");
  }
  void LowerLandingGear(){
    System.out.println("Landing gear lowered");
  }
  void RaiseLandingGear(){
    System.out.println("Landing gear raised");
  }
  void LiftOff(){
    RaiseLandingGear();
    System.out.println("Lifting off");
  }
  void ListSpecs(){
    System.out.println(buildYear);
    System.out.println(builderName);
    System.out.println(numOfSeats);
  }
}

class Car extends RoadVehicle{
  Car(int buildYear, String builderName, int numOfTires, int numOfSeats){
    this.buildYear = buildYear;
    this.builderName = builderName;
    this.numOfTires = numOfTires;
    this.numOfSeats = numOfSeats;
  }
  int buildYear;
  String builderName;
  int numOfTires;
  int numOfSeats;
  void ChangeGear(int gear){
    System.out.println("Changed gear to " + gear);
  }
  void IgniteEngine(){
    System.out.println("Car engine ignited");
  }
  void ListSpecs(){
    System.out.println(buildYear);
    System.out.println(builderName);
    System.out.println(numOfTires);
    System.out.println(numOfSeats);
  }
}

abstract class AirVehicle extends Vehicle{
  int buildYear;
  String builderName;
  int numOfSeats;
  abstract void IgniteEngine();
  abstract void LiftOff();
  abstract void ListSpecs();
}