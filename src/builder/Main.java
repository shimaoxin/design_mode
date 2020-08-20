package builder;

/**
 * 建造者模式
 * 肯德基外卖
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class Main {
    public static void main(String[] args) {
        KFCPackageBuilder builder = new KFCPackageBuilder();
//        Package pa =  builder.common(); //普通套餐
        Package pa =  builder.familyMeals(); //全家桶
        System.out.println("套餐名称：" + pa.getName());
        System.out.println("套餐内容：" + pa.getItemNames());
        System.out.println("套餐价格：" + pa.price());
        System.out.println("配送费：" + pa.deliveryPrice());
        System.out.println("总价：" + (pa.deliveryPrice() + pa.price()));
    }
}
