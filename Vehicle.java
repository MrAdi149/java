class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
    public void drive(){
        System.out.println("start driveing");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car mCar = new Car();
        mCar.honk();
    
        System.out.println(mCar.brand + " " + mCar.modelName);
    }

    @Override
    public void drive(){
        System.out.println("Repairing a car");
    }
}
