package strategy;

import java.math.BigDecimal;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class WeChatPay implements PayAble {
    @Override
    public BigDecimal queryBalance() {
        System.out.println("微信余额查询");
        return BigDecimal.ZERO;
    }

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
