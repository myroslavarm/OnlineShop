package GameShop;

import java.util.ArrayList;

public class ComputerGame {
    private static int cnt = 0;
    private final int id = cnt++;
    private ComputerGameParam params;

    public ComputerGameParam getParams() {
        return params;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return params.getName();
    }

    public String getDescription() {
        return params.getDescription();
    }

    public ArrayList<Genre> getGenres() {
        return params.getGenres();
    }

    public double getPrice() {
        return params.getPrice();
    }

    public int getAgeRestriction() {
        return params.getAgeRestriction();
    }

    public ArrayList<String> getPlatforms() {
        return params.getPlatforms();
    }

    public ComputerGame(ComputerGameParam param){
        params = new ComputerGameParam(param);
    }
}
