package factory;

import phase.Expression;
import phase.NotPCPhase;

public class NotPCFactory extends AbstractFactory {

    public NotPCFactory() {
        this.prototype = new NotPCPhase();
    }

    @Override
    public Expression makeCompromise() {
        return new Expression("\"my way, or the highway\"");
    }

    @Override
    public Expression makeGrade() {
        return new Expression("\"take test, deal with the results\"");
    }
}
