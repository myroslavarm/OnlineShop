package GameShop;

import GameShop.ComputerGameParam;
import GameShop.Genre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ComputerGameParamTest {
    private ComputerGameParam cgp;

    @Before
    public void initializationOfObject(){
        ArrayList<Genre> genres = new ArrayList<>();
        genres.add(Genre.ACTION);
        cgp = new ComputerGameParam("Counter Strike", "A shooter game", genres, 25, 14);
    }

    @Test
    public void testToString(){
        assertEquals("GameShop.ComputerGameParam{name='Counter Strike', description='A shooter game', genres=[action], " +
                "price=25, ageRestriction=14, platforms=[]}", cgp.toString());
    }
}
