import factory.AbstractFactory;
import factory.NotPCFactory;
import factory.PCFactory;

public class FactoryFmProto {
    public static void main(String[] args) {
        AbstractFactory factory;
        if (args.length > 0) {
            factory = new PCFactory();
        } else {
            factory = new NotPCFactory();
        }

        for (int i=0; i< 3; i++) {
            System.out.println(factory.makePhase());
        }
        System.out.println();
        System.out.println(factory.makeCompromise());
        System.out.println(factory.makeGrade());
    }
}