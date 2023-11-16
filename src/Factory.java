
public class Factory {
    public static Animal createAnimal(String animalName) {
        Animal animal = null;
        if (animalName.equals("Cat")) {
            animal = new Cat();
        }
        else if (animalName.equals("Dog")) {
            animal = new Dog();
        }
        return animal;
    }
}
