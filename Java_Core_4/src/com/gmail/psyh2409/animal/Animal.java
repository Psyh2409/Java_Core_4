package com.gmail.psyh2409.animal;

public class Animal {

	private String name;
    private double speed;
    private int age;

    public Animal(String name, double speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Leopard", 20, 7);

        printAnimal(animal);
        System.out.println("-------------------------");

        animal.setName("Bull");
        animal.setSpeed(2);
        animal.setAge(14);

        printAnimal(animal);
    }

	public static void printAnimal(Animal animal) {
		System.out.println("Name of animal = " + animal.getName() 
        + ", speed of animal = " + animal.getSpeed() 
        + " km/h, age of animal = " + animal.getAge() + " years old ");
	}

    /*Output:
     name of animal = Leopard, speed of animal = 20.0 km/h, age of animal = 7 years old 
	 -------------------------
	 name of animal = Bull, speed of animal = 2.0 km/h, age of animal = 14 years old 
     * */
    
}
