package GameShop;

import java.util.ArrayList;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    @Override
    public boolean deliver(ArrayList<ComputerGame> games) {
        System.out.println("Successfully delivered via Nova Poshta!");
        return true;
    }
}
