package GameShop;

public class CartDecorator extends Cart{
    protected Cart cartToDecorate;

    public CartDecorator(Cart cart){
        cartToDecorate = cart;
    }

    @Override
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        cartToDecorate.setPaymentStrategy(paymentStrategy);
    }

    @Override
    public void setDeliveryStrategy(DeliveryStrategy deliveryStategy){
        cartToDecorate.setDeliveryStrategy(deliveryStategy);
    }

    @Override
    public double computeTotalPrice(){
        return cartToDecorate.computeTotalPrice();
    }

    @Override
    public boolean ship(){
        return cartToDecorate.ship();
    }

    @Override
    public void addGame(ComputerGame game){
        cartToDecorate.addGame(game);
    }
}
