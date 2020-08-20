package proxy;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class AddTransactionalProxy extends AddOpearte {

    @Override
    public void opearte() {
        System.out.println("事务开始");
        super.opearte();
        System.out.println("事务结束");
    }
}
