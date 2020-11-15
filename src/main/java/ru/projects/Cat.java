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
    public Cat(){

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
