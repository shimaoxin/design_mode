package strategy;

import java.math.BigDecimal;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public interface PayAble {

    /**
     * 查询余额
     * @return
     */
    BigDecimal queryBalance();

    /**
     * 支付
     */
    void pay();
}
