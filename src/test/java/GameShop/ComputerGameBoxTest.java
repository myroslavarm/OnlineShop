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
        cgp1 = new ComputerGameParam("Kill the Hobbit", "Kid Game", genres, 20, 5);
        cgp2 = new ComputerGameParam("Kill the Hobbit", "Kid Game", genres, 20, 5);
        cg1 = new ComputerGame(cgp1);
        cg2 = new ComputerGame(cgp2);
        cgb = new ComputerGameBox();
        games = new ArrayList<>();
        games.add(cg1);
        games.add(cg2);
        cgb.addGame(cg1);
        cgb.addGame(cg2);
    }

    @Test
    public void testGetGames() throws Exception {
        assertEquals(games, cgb.getGames());
    }

    @Test
    public void testSearch() throws Exception {
        System.out.println(cgb);
        System.out.println(cgp1);
        assertEquals(cgb.search(cgp1).size(), 1);
    }

}