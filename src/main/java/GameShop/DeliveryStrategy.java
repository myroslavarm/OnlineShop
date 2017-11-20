package GameShop;

import java.util.ArrayList;

public interface DeliveryStrategy {
    public boolean deliver(ArrayList<ComputerGame> games);
}
