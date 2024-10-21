//Encapsulation

public class Person {
    private String name;
    private String country;
    private int age;

    public void setCountry(String newCountry){
        this.country = newCountry;
    }

    public String getCountry(){
        return country;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
}
