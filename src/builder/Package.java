package builder;

/**
 * 套餐
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public interface Package {

    /**
     * 套餐名称
     * @return
     */
    String getName();

    /**
     * 套餐内容
     * @return
     */
    String getItemNames();


    /**
     * 配送费
     * @return
     */
    int deliveryPrice();

    /**
     * 套餐价格
     * @return
     */
    int price();

}
