package ru.projects;

public class Cat implements Action{

    private String name;
    private int age;
    private double weight;
    private String breed;

    public Cat(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public void showInfo() {
        System.out.println("This is "+ name +". "+name+ " is " + age + " years old. " + "Breed is "+ breed + " and weight is "+ weight);

    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");

    }

    @Override
    public void makeSound() {
        System.out.println(name + " is meowing");

    }

    @Override
    public void ableToMove() {
        System.out.println(name +" is moving");

    }

    @Override
    public void ableToSwim() {
        System.out.println(name + " swims");

    }
}
