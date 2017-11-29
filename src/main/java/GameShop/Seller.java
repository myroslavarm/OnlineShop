package GameShop;

public class Seller extends User {
    @Override
    public void update() {
        System.out.println("Updating for the seller...");
        super.update();
    }
}
