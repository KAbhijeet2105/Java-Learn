package behaviouralPatterns.strategyExample;

import java.util.Date;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String dateOfExpiry;
    private String cvv;

    public CreditCardStrategy(String nm, String cardNum, String expiryDate, String cvv){

        this.name = nm;
        this.cardNumber = cardNum;
        this.dateOfExpiry = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid via Credit card!");
    }
}
