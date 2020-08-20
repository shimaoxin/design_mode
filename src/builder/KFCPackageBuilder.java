package builder;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class KFCPackageBuilder {

    public KFCPackage common() {
        KFCPackage kfcPackage = new KFCPackage();
        kfcPackage.setName("普通套餐");
        kfcPackage.addItem(new Coke());
        kfcPackage.addItem(new Hamburger());
        kfcPackage.addItem(new Chips());
        return kfcPackage;
    }

    public KFCPackage familyMeals() {
        KFCPackage kfcPackage = new KFCPackage();
        kfcPackage.setName("全家桶");
        kfcPackage.addItem(new Coke());
        kfcPackage.addItem(new Coke());
        kfcPackage.addItem(new Hamburger());
        kfcPackage.addItem(new Hamburger());
        kfcPackage.addItem(new Hamburger());
        kfcPackage.addItem(new Chips());
        kfcPackage.addItem(new ChickenRolls());
        return kfcPackage;
    }
}
