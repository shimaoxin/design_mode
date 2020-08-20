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
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
