package GameShop;

public class Customer extends User {
    @Override
    public void update() {
        System.out.println("Updating for the customer...");
        super.update();
    }
}
