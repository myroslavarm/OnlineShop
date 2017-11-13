package GameShop;

public enum Genre {
    ACTION("action"), MOBA("moba"), SIMULATION("simulation"), SHOOTER("shooter"), MYSTERY("mystery");

    private String name;

    Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}