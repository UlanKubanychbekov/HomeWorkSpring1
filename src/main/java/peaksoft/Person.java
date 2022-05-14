package peaksoft;

public class Person {
    private String name;
    private int age;
    private Animal animal;

    public Person() {
    }

    public Person(Animal animal) {
        this.animal = animal;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void animalDog(){
        animal.animalPlus();
        animal.animalMinus();
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
