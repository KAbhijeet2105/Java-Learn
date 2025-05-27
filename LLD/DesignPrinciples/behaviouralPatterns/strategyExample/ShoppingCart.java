package behaviouralPatterns.strategyExample;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    public ShoppingCart(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public int calculateBill()
    {
        int tot = 0;
        for (Item itm : items){
            tot+= itm.getPrice();
        }
        return tot;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateBill();
        paymentMethod.pay(amount);
    }
}
