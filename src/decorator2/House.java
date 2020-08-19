package decorator2;

/**
 * Description
 *
 * @author yxy
 * @date 2020/08/2020/8/19
 */
public class House implements DecorateAble<House>{

    @Override
    public House decorate(OpearteAble opearte) {
        opearte.opearte();
        return this;
    }
}
