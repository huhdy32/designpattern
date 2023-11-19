public class NotPCFactory extends AbstractFactory {
    @Override
    public Expression makeCompromise() {
        return new Expression("\"my way, or the highway\"");
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"take test, deal with the results\"");
    }
}
