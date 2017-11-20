package GameShop;

public class Privat24Payment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.println("Payment is successful!");
        return true;
    }
}
