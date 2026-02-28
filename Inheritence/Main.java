class Main{
    public static void main(String[] args){
        ElectricCar c1 = new ElectricCar("Mahindra", "Ex6", 2025, "electricity", "Electric", 12,  1);
        c1.displayInfo();
        c1.displayBatteryInfo();
        Car c2 = new Car("Honda", "City", 2018, "Petrol", "Non-Electric");
        c2.displayInfo();
    }
}

class Vehicle{
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("The brand of the vehicle: " + brand);
        System.out.println("The model of the vehicle: " + model);
        System.out.println("The vehicle was launced in year: " + year);
    }
}

class Car extends Vehicle{
    protected String feulType;
    protected String CarType;

    public Car(String brand, String model, int year, String feulType, String CarType){
        super(brand, model, year);
        this.feulType = feulType;
        this.CarType = CarType;
    }

    @Override
    void displayInfo(){
        System.out.println("The brand name of car is " + brand);
        System.out.println("The model name of car is " + model);
        System.out.println("The year car was bought in was " + year);
        System.out.println("The fuel type of the car is " + feulType);
        System.out.println("The car type is " + CarType);
    }

}

class ElectricCar extends Car{
    protected int batteryLife;
    protected int ChargingTime;

    public ElectricCar(String brand, String model, int year, String feulType, String CarType, int batteryLife, int ChargingTime){
        super(brand, model, year, feulType, "Electric");
        this.ChargingTime = ChargingTime;
        this.batteryLife = batteryLife;
    }

    void displayBatteryInfo(){
        System.out.println("The battery life of this car is " + batteryLife + "years.");
        System.out.println("The charging time of the battery is " + ChargingTime + "day.");
    }

    @Override
    void displayInfo(){
        System.out.println("The brand name of car is " + brand);
        System.out.println("The model name of car is " + model);
        System.out.println("The year car was bought in was " + year);
        System.out.println("The fuel type of the car is " + feulType);
        System.out.println("The car type is " + CarType);
    }
}