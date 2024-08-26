package poo;

public class POOLesson {
    public static void main(String[] args) {

        Farm<Cow> farm = new Farm<Cow>(2);
        Farm<Cat> farmCats = new Farm<Cat>(1);
        // Farm<Perro> farmPerro = new Farm<Perro>(1)

        farmCats.addAnimal(new Cat("Tom", "blanco", 4, 2.3));
        farm.addAnimal(new Cow("Pomarrosa", "Pinta", 4, 102.36));
        // farmPerro.addAnimal(new Perro("Nacho", "Puder", "marron", 4, 30.0));
        farm.addAnimal(new Cow("Colinegra", "blanca y negra", 4, 140));

        farm.getMyAnimals();
        farmCats.getMyAnimals();

    }

    public static void listenFarmSounds(IMakeSound farm[]) {

        for (IMakeSound animal : farm) {
            animal.makeSound();
        }
    }

    // private static void fillFarm(Object list[]) {
    // list[0] = new Perro("Nacho", "Puder", "marron", 4, 30.0);
    // list[1] = new Cocodrilo("Pepe", "Verde", 4, 12.7, 6);
    // list[2] = new Cat("Tom", "blanco", 4, 2.3);
    // list[3] = new Cow("Pomarrosa", "Pinta", 4, 102.36);

    // }

}
