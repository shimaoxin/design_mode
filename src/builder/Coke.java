package builder;

/**
 * 可乐
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class Coke implements Item{
    @Override
    public String getName() {
        return "可口可乐";
    }

    @Override
    public int getWight() {
        return 2;
    }

    @Override
    public int getPrice() {
        return 6;
    }
}
