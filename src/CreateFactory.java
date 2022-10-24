package src;

public class CreateFactory {

    private static AbstractFactory abstFactory = null;

    static AbstractFactory getFactory(){
            abstFactory = new ConcreteFactory();
            return  abstFactory;
    }
}
