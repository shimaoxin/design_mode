package strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/19
 */
public class PayContext {

    private Map<String, PayAble> pays = new ConcurrentHashMap<>();

    public PayContext() {
        pays.put("wechat", new WeChatPay());
        pays.put("ali", new AliPay());
    }

    public PayAble getPayAble(String key){
        return pays.get(key);
    }
}
