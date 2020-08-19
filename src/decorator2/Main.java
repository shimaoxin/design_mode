package decorator2;

/**
 * Description
 *
 * @author yxy
 * @date 2020/08/2020/8/19
 */
public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.decorate(new CarpenterDecorator())
            .decorate(new PainterDecorator());
    }
}
