package builder;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class Chips implements Item{
    @Override
    public String getName() {
        return "薯条";
    }

    @Override
    public int getWight() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 7;
    }
}
