package observer;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public abstract class Listener<T extends Event> {

    public abstract void onEvent(T t);

}
