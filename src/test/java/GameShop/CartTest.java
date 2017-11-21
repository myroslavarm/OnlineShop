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
    }

    @Test
    public void testSetPaymentStrategy() throws Exception {
        assertEquals(true, cash.pay(43100));
    }

    @Test
    public void testSetDeliveryStrategy() throws Exception {
        assertEquals(true, np.deliver(games));
    }

    @Test
    public void computeTotalPrice() throws Exception {
        assertEquals(43100.0, cart.computeTotalPrice(),0.001);
    }

    @Test
    public void testShip() throws Exception {
        assertEquals(true, cart.ship());
    }

    @Test
    public void testAddGame() throws Exception {
        cart.addGame(gm1);
        assertEquals(43200.0, cart.computeTotalPrice(), 0.001);
    }

    @Test
    public void testDiscount() throws Exception {
        cart = new DiscountDecorator(cart);
        assertEquals(38790.0, cart.computeTotalPrice(),0.001);
    }

    @Test
    public void testBonus() throws Exception {
       cart = new BonusDecorator(cart);
        assertEquals(43100.0, cart.computeTotalPrice(), 0.001);
    }

}