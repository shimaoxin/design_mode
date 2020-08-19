package decorator2;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class PainterDecorator implements OpearteAble{
    @Override
    public void opearte() {
        System.out.println("油漆工进场");
    }
}
