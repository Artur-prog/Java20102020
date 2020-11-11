package ru.projects;

public class StartMain {
    public static void main(String[] args) {
        Animal animal = new Animal();

        showAction(animal.dog1);
        showAction(animal.dog2);
        showAction(animal.cat1);
        showAction(animal.cat2);


    }

    public static void showAction(Action action){
        action.showInfo();
        action.makeSound();
        action.ableToMove();
        action.eat();
        action.ableToSwim();


    }
}
