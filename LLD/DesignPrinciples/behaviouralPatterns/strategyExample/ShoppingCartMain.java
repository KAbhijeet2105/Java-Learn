package behaviouralPatterns.strategyExample;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("1","USB HUB", 480));
        cart.addItem(new Item("2","Mechanical Keyboard", 3800));

        //pay via credit card

        cart.pay(new CreditCardStrategy("abhijeet kadam","111 222 333 444", "11/23","555"));

        //pay via paypal

        cart.pay(new PaypalStrategy("abhijeet kadam","abhi@gamil.com"));
    }

}
