
public class Client {
    public void getAnimal() {
        String name = "Cat";
        Animal animal = Factory.createAnimal(name);

        System.out.println(animal.getName());
        System.out.println(animal.move());
        System.out.println(animal.sound());

    }
}
