package GameShop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CartTest {
    private CashPayment cash;
    private Privat24Payment privat;
    private DeliveryNovaPoshta np;
    private DeliveryDHL dhl;
    private Cart cart;
    private CartDecorator cd1;
    private CartDecorator cd2;
    private ArrayList<Genre> genres = new ArrayList<>();
    private ComputerGameParam cgp1;
    private ComputerGameParam cgp2;
    private ComputerGame gm1;
    private ComputerGame gm2;
    private ArrayList<ComputerGame> games;
    private BonusDecorator bd;
    private DiscountDecorator dd;

    @Before
    public void initializationOfObject() {
        cash = new CashPayment();
        privat = new Privat24Payment();
        np = new DeliveryNovaPoshta();
        dhl = new DeliveryDHL();
        cart = new Cart(cash, np);
        cd1 = new CartDecorator(cart);
        genres.add(Genre.ACTION);
        cgp1 = new ComputerGameParam("Chesnut cream", "Vincent loses", genres, 100, 18);
        cgp2 = new ComputerGameParam("UCU", "Kill the lines", genres, 43000, 18);
        gm1 = new ComputerGame(cgp1);
        gm2 = new ComputerGame(cgp2);
        cart.addGame(gm1);
        cart.addGame(gm2);
        games = new ArrayList<>();
        games.add(gm1);
        games.add(gm2);
        bd = new BonusDecorator(cart);
        dd = new DiscountDecorator(cart);
    }

    @Test
    public void testMain() throws Exception {
        assertEquals(cart.ship(), true);
        assertEquals(np.deliver(games), true);
        assertEquals(cart.computeTotalPrice(),43100.0, 0.001);
        assertEquals(cash.pay(43100), true);
        assertEquals(dd.computeTotalPrice(),38790, 0.001);
        assertEquals(bd.computeTotalPrice(), 43100, 0.001);
    }

}