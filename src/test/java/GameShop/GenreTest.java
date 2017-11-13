package GameShop;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenreTest {
    @Test
    public void testToString() throws Exception {
        assertEquals(Genre.ACTION.toString(), "action");
        assertEquals(Genre.MYSTERY.toString(), "mystery");
        assertEquals(Genre.SHOOTER.toString(), "shooter");
    }

}