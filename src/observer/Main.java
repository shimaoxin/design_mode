package observer;

/**
 * 观察者模式
 * 监听器
 *
 * @author smx
 * @date 2020/8/20
 */
public class Main {

    public static void main(String[] args) {
        ListenerContext context = new ListenerContext();
        context.addListener(new AddLogListener());
        context.addListener(new AddSmsListener());
        context.addListener(new UpdateListener());

        context.publishEvent(new AddEvent("source", "增加成功"));
        context.publishEvent(new UpdateEvent("source", "修改成功"));

    }
}
