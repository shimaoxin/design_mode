package observer;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class ListenerContext {

    private Set<Listener> listeners = new LinkedHashSet<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void publishEvent(Event event) {
        Set<Listener> set = getListersByEnent(event);
        for (Listener listener : set) {
            listener.onEvent(event);
        }
    }

    private Set<Listener> getListersByEnent(Event event) {
        Set<Listener> set = new LinkedHashSet<>();
        for (Listener listener : listeners) {
            Method method = listener.getClass().getMethods()[0];
            Class<?> clazz = method.getParameterTypes()[0];
            if(clazz == event.getClass()) {
                set.add(listener);
            }
        }
        return set;
    }
}
