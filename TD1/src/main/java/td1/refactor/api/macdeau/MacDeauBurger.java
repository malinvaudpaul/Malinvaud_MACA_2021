package td1.refactor.api.macdeau;

import td1.refactor.api.general.FoodProduct;

import java.util.List;

public class MacDeauBurger {
    private String name ;
    private List<FoodProduct> items ;

    public MacDeauBurger(String name, List<FoodProduct> items) {
        this.name = name ;
        this.items = items ;
    }
}
