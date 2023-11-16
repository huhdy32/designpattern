
public class Dog extends Animal{

    private String name = "강아지";
    @Override
    public int move() {
        return 5;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sound() {
        return " 멍멍 멍 씨발 멍!";
    }
}
