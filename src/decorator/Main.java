package decorator;

/**
 * 装饰者模式
 * 装修
 */
public class Main {
    public static void main(String[] args) {
        House house = new House();
        Decorator decorator = new ConcerteDecorator(new PlumbDecorator(house));
        decorator = new CarpenterDecorator(decorator);
        decorator = new PainterDecorator(decorator);
        decorator.opearte();
    }
}
