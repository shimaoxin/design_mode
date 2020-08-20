package observer;

/**
 * 事件
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public abstract class Event {

    protected Object source;

    public Event(Object source) {
        this.source = source;
    }
}
