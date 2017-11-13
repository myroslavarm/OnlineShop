package GameShop;

public class ComputerGame {
    private static int cnt = 0;
    private final int id = cnt++;
    private ComputerGameParam params;

    public int getId() {
        return id;
    }

    public ComputerGameParam getParams() {
        return params;
    }

    public void setParams(ComputerGameParam params) {
        this.params = params;
    }

    public ComputerGame(ComputerGameParam params){
        params = new ComputerGameParam(params);

    }
}
