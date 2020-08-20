package builder;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class ChickenRolls implements Item{
    @Override
    public String getName() {
        return "鸡肉卷";
    }

    @Override
    public int getWight() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 8;
    }
}
