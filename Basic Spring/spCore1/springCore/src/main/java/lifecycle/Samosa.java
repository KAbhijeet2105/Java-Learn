package lifecycle;

public class Samosa {

    private double price;

    public Samosa() {
    }

    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting property for samosa!");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init()
    {
        System.out.println("Init method called!");
    }

    public void destroy()
    {
        System.out.println("Destroy method called!");
    }


}
