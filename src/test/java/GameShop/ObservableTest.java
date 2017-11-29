package GameShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObservableTest {
    private Observable observable;
    private Customer customer;
    private Seller seller;

    @Before
    public void initializationOfObject() {
        observable = new Observable();
        customer = new Customer();
        seller = new Seller();
    }

    @Test
    public void testGetObservers() throws Exception {
        assertEquals(0, observable.getObservers().size());
    }

    @Test
    public void testAddObserver() throws Exception {
        observable.addObserver(customer);
        observable.addObserver(seller);
        assertEquals(2, observable.getObservers().size());
    }

    @Test
    public void testRemoveObserver() throws Exception {
        observable.addObserver(customer);
        observable.addObserver(seller);
        observable.removeObserver(customer);
        assertEquals(1, observable.getObservers().size());
    }

    @Test
    public void testNotifyObservers() throws Exception {
        observable.addObserver(customer);
        observable.addObserver(seller);
        observable.notifyObservers();
    }

}