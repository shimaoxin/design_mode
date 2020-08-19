package strategy;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class Main {
    public static void main(String[] args) {
        PayContext context = new PayContext();
        context.getPayAble("wechat").queryBalance();
        context.getPayAble("wechat").pay();

        context.getPayAble("ali").queryBalance();
        context.getPayAble("ali").pay();
    }
}
