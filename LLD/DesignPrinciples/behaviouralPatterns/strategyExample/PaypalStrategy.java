package behaviouralPatterns.strategyExample;

public class PaypalStrategy implements PaymentStrategy{

    private String name;
    private String emailId;

    public PaypalStrategy(String nm, String mailid){
        this.name = nm;
        this.emailId = mailid;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid "+amount+" using Paypal!");
    }
}
