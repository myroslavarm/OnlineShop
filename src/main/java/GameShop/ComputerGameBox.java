package GameShop;

import java.util.ArrayList;

public class ComputerGameBox {
    private ArrayList<ComputerGame> games = new ArrayList<ComputerGame>();

    public void addGame(ComputerGame game){
        games.add(game);
    }

    public ArrayList<ComputerGame> getGames() {
        return games;
    }

    public ArrayList<ComputerGame> search(ComputerGameParam params) {
        ArrayList<ComputerGame> matchingGames = new ArrayList<>();
        for(ComputerGame gm : games)
            if (params.match(gm.getParams())) {
                matchingGames.add(gm);
            }
        return matchingGames;
    }
}
