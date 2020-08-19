package decorator;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        Decorator decorator = new ConcerteDecorator(new PlumbDecorator(house));
        decorator = new CarpenterDecorator(decorator);
        decorator = new PainterDecorator(decorator);
        decorator.opearte();
    }
}
