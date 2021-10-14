package td1.refactor.api.bigburger;

import td1.refactor.api.general.FoodProduct;

import java.util.List;

public class BigBurgerBurger {
    private String name ;
    private List<FoodProduct> items ;

    public BigBurgerBurger(String name, List<FoodProduct> items) {
        this.name = name ;
        this.items = items ;
    }
}
