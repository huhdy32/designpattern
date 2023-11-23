public class Dick implements Person {

    private final String NAME = "DICK";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
