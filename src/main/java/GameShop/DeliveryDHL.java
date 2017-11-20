package GameShop;

import java.util.ArrayList;

public class DeliveryDHL implements DeliveryStrategy {
    @Override
    public boolean deliver(ArrayList<ComputerGame> games) {
        System.out.println("Successfully delivered via DHL!");
        return true;
    }
}
