class  Animal {
    public void makeSound(){
        System.out.println("the animal makes a sound");
    }
}

class cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("the cat sound");
    }
}