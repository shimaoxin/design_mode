package decorator;

/**
 * Description
 *
 * @author yxy
 * @date 2020/08/2020/8/19
 */
public class CarpenterDecorator extends Decorator {

    public CarpenterDecorator(Component component) {
        super(component);
    }

    @Override
    public void opearte() {
        super.component.opearte();
        System.out.println("木工进场");
    }
}
