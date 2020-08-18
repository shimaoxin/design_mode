package decorator;

public class ConcerteDecorator extends Decorator{

    public ConcerteDecorator(Component component) {
        super(component);
    }

    @Override
    public void opearte() {
        super.component.opearte();
        System.out.println("泥水匠入场");
    }

    
}
