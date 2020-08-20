package strategy;

/**
 * 策略模式
 * 微信支付与支付宝支付
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class Main {
    public static void main(String[] args) {
        PayContext context = new PayContext();
        PayAble payAble = context.getPayAble("wechat");
        payAble.queryBalance();
        payAble.pay();

        payAble = context.getPayAble("ali");
        payAble.queryBalance();
        payAble.pay();
    }
}
