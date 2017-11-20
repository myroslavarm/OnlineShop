package GameShop;

import org.junit.runner.Computer;

import java.util.ArrayList;

public class Cart{
    private PaymentStrategy paymentstrategy;
    private DeliveryStrategy deliverystrategy;
    private ArrayList<ComputerGame> games;

    public void setPaymentStrategy(PaymentStrategy paymentstrategy) {
        this.paymentstrategy = paymentstrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliverystrategy) {
        this.deliverystrategy = deliverystrategy;
    }

    public double computeTotalPrice(){
        return 100.500;
    }

    public boolean ship(){
        if(paymentstrategy.pay(computeTotalPrice())){
            deliverystrategy.deliver(games);
            return true;
        }
        return false;
    }

    public void addGame(ComputerGame game){
        games.add(game);
    }
}
