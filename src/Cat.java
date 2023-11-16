
public class Cat extends Animal {

    private String name = "고양이";
    @Override
    public int move() {
        return 10;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sound() {
        return "먕 먕 먕";
    }
}
