package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;

    public Order() {
        this.cocktails = new ArrayList<>();
    }

    public List<String> getCocktails() {
        return cocktails;
    }

    public void addCocktail(String cocktail) {
        cocktails.add(cocktail);
    }

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public String getOwner() {
        return owner;
    }

    public String getTarget() {
        return target;
    }
}
