class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        practice mPractice = new practice();
        System.out.println("sum: " + mPractice.sum(4));
        System.out.println("multiply: " + mPractice.multiply(4,5));

        //Encapsulation
        Person mPerson = new Person();
        // mPerson.name = "John";
        // System.out.println(mPerson.name); 
        mPerson.setName("John");
        System.out.println(mPerson.getName());

        mPerson.setAge(34);
        System.out.println(mPerson.getAge());

        mPerson.setCountry("India");
        System.out.println(mPerson.getCountry());

        BankAccount mBankAccount = new BankAccount();
        mBankAccount.setaccNo(34);
        mBankAccount.setBalance(40000);

        System.out.println(mBankAccount.getaccNo()+ " " + mBankAccount.getBalance());

        Animal animal = new Animal();
        cat cat = new cat();

        cat.makeSound();
        animal.makeSound();

        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();

        Rectangle rectangle = new Rectangle();
        rectangle.getArea(4, 5);
    }
}
