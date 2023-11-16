import java.awt.*;

public class Main {
    public static void main(String[] args) {

        String request = "Cat";
        // 클라이언트가 객체를 직접 생성하도록 하지 않고, 객체를 만드는 역할을 담당하는 클래스를 따로 구현하자
        // -> 팩토리 메소드
        Animal animal = Factory.createAnimal("Cat");

        System.out.println(animal.getName());
        System.out.println(animal.move());
        System.out.println(animal.sound());

    }
}