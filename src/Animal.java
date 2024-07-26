interface IAnimal {
    default void makeSound() {
        System.out.println("The animal makes a sound.");
    }

}

public class Animal {
    // main method start here
    public static void main(String[] args) {

        // creating object of dog here
        IAnimal dog = new Dog();
        // this method show the dog sound
        dog.makeSound();

        // creating object of cat here
        IAnimal cat = new Cat();
        // this method show the cat sound
        cat.makeSound();


    }
}

class Dog implements IAnimal {
    @Override
    public void makeSound() {
        IAnimal.super.makeSound();
        System.out.println("The Dog barks");
    }
}

class Cat implements IAnimal {
    @Override
    public void makeSound() {
        //   IAnimal.super.makeSound();
        System.out.println("The Cat meows");
    }
}


