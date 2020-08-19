package strategy;

import java.math.BigDecimal;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class AliPay implements PayAble {
    @Override
    public BigDecimal queryBalance() {
        System.out.println("支付宝余额查询");
        return BigDecimal.ONE;
    }

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
