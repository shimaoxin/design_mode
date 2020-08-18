package decorator;

public class PlumbDecorator extends Decorator{

    public PlumbDecorator(Component component) {
        super(component);
    }

    @Override
    public void opearte() {
        super.component.opearte();
        System.out.println("水电工入场");
    }
    
}
