package decorator2;

/**
 * Description
 *
 * @author yxy
 * @date 2020/08/2020/8/19
 */
public interface DecorateAble<T> {

    T decorate(OpearteAble opearte);
}
