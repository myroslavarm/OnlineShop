package GameShop;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.format("You paid %.2f UAH\n", price);
        return true;
    }
}