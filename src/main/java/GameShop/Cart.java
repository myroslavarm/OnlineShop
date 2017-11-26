package GameShop;

import org.junit.runner.Computer;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private PaymentStrategy paymentstrategy;
    private DeliveryStrategy deliverystrategy;
    private ArrayList<ComputerGame> games;

    public Cart(PaymentStrategy paymentstrategy, DeliveryStrategy deliverystrategy) {
        this.games = new ArrayList<>();
        this.paymentstrategy = paymentstrategy;
        this.deliverystrategy = deliverystrategy;
    }
    public Cart(){

    }

    public void setPaymentStrategy(PaymentStrategy paymentstrategy) {
        this.paymentstrategy = paymentstrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliverystrategy) {
        this.deliverystrategy = deliverystrategy;
    }

    public List<ComputerGame> getGames() {
        return games;
    }

    public double computeTotalPrice(){
        double price = 0;
        for(ComputerGame game : games){
            price += game.getPrice();
        }
        return price;
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
