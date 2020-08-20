package proxy;

/**
 * 代理模式
 * 日志代理与事务代理
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class Main {

    public static void main(String[] args) {
        //聚合形式的代理
        AddOpearte addOpearte = new AddOpearte();
        AddLogProxy addLogProxy = new AddLogProxy(addOpearte);
        addLogProxy.opearte();

        //继承形式的代理
        AddTransactionalProxy addTransactionalProxy = new AddTransactionalProxy();
        addTransactionalProxy.opearte();

    }
}
