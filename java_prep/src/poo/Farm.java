package poo;

public class Farm<E extends Animal> {

    Animal animals[];
    int animalCount = 0;

    public Farm(int totalAnimals) {
        animals = new Animal[totalAnimals];
    }

    public void addAnimal(E a) {
        if (animalCount < animals.length) {
            animals[animalCount++] = a;
        }
    }

    public void getMyAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " " + animal.getColor());
        }
    }

}
