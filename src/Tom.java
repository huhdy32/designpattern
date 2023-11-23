public class Tom implements Person {

    private final String NAME = "TOM";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
