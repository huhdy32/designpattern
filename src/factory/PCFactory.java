public class PCFactory extends AbstractFactory {
    public PCFactory() {
        prototype = new PCPhase();
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"do it yout way, any way, or no way\"");
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\" ypu pass, self-esteem intact\"");
    }
}
