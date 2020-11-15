package ru.projects;

public class StartMain {
    public static void main(String[] args) {
       Dog dog1 = new Dog();
       Cat cat1 = new Cat();

       dog1.setName("Beethoven");
       dog1.setAge(5);
       dog1.setWeight(30.0);
       dog1.setBreed("Labrador");

       cat1.setName("Baks");
       cat1.setAge(3);
       cat1.setWeight(4.0);
       cat1.setBreed("Mei-kun");


       showAction(dog1);
       showAction(cat1);



    }

    public static void showAction(Action action){
        action.showInfo();
        action.makeSound();
        action.ableToMove();
        action.eat();
        action.ableToSwim();


    }
}
