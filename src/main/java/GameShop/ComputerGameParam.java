package GameShop;

import java.util.ArrayList;

public class ComputerGameParam {
    private String name;
    private String description;
    private ArrayList<Genre> genres = new ArrayList<Genre>();
    private int price;
    private int ageRestriction;
    private ArrayList<String> platforms = new ArrayList<String>();

    public ComputerGameParam(String name, String description, ArrayList<Genre> genres, int price, int ageRestriction) {
        this.name = name;
        this.description = description;
        this.genres = genres;
        this.price = price;
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return "GameShop.ComputerGameParam{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", genres=" + genres +
                ", price=" + price +
                ", ageRestriction=" + ageRestriction +
                ", platforms=" + platforms +
                '}';
    }

    public ComputerGameParam(ComputerGameParam params) {
        name = params.name;
        description = params.description;
        genres = new ArrayList<>(params.genres);
        price = params.price;
        ageRestriction = params.ageRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public ArrayList<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(ArrayList<String> platforms) {
        this.platforms = platforms;
    }

    public boolean match(ComputerGameParam otherGame){
        if(!getName().equals(otherGame.getName())){
            return false;
        }
        if(!getGenres().equals(otherGame.getGenres())){
            return false;
        }
        if(getName().equals(otherGame.getName()) && getGenres().equals(otherGame.getGenres())){
            return true;
        }
        return false;
    }
}
