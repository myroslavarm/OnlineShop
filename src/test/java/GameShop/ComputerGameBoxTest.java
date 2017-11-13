package GameShop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ComputerGameBoxTest {
    private ComputerGameParam cgp1, cgp2;
    private ComputerGame cg1, cg2;
    private ComputerGameBox cgb;
    private ArrayList<ComputerGame> games;

    @Before
    public void initializationOfObject(){
        ArrayList<Genre> genres = new ArrayList<>();
        genres.add(Genre.ACTION);
        cgp1 = new ComputerGameParam("Kill the Hobbit", genres);
        cgp2 = new ComputerGameParam("Kill the Hobbit", genres);
        cg1 = new ComputerGame(cgp1);
        cg2 = new ComputerGame(cgp2);
        cgb = new ComputerGameBox();
    }

    @Test
    public void testGetGames() throws Exception {
        cgb.addGame(cg1);
        assertEquals(cgb, cgb.getGames());
    }

    @Test
    public void testSearch() throws Exception {
        cgb.addGame(cg2);
        assertEquals(cgb.search(cgp1), true);
    }

}