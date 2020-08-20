package builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description
 *
 * @author smx
 * @date 2020/08/2020/8/20
 */
public class KFCPackage implements Package{

    private List<Item> items = new ArrayList<>();

    private String name;

    private double sale;

    public KFCPackage(String name, double sale) {
        this.name = name;
        this.sale = sale;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getItemNames() {
        List<String> names = items.stream().map(Item::getName).collect(Collectors.toList());
        return String.join(",", names);
    }

    @Override
    public int deliveryPrice() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWight();
        }
        return totalWeight > 5 ? 10 : 5;
    }

    @Override
    public int price() {
        int price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return  (int)(price * sale);
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
