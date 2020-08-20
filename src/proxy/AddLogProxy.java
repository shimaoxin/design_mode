package proxy;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class AddLogProxy implements OpearteAble{

    private AddOpearte addOpearte;

    public AddLogProxy(AddOpearte addOpearte) {
        this.addOpearte = addOpearte;
    }

    @Override
    public void opearte() {
        addOpearte.opearte();
        System.out.println("记录日志");
    }
}
