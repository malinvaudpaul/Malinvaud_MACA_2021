package td1.refactor.api.bigburger;

import td1.refactor.api.general.Burger;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.FoodProduct;
import td1.refactor.api.general.SauceType;

import java.util.List;

public class BigBurgerCook implements BurgerCook {
    private String name ;
    private List<FoodProduct> products ;

    public BigBurgerCook(String name, List<FoodProduct> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public BurgerCook with_cheese() {
        return null;
    }

    @Override
    public BurgerCook with_onions() {
        return null;
    }

    @Override
    public BurgerCook with_sauce(SauceType sauce) {
        return null;
    }

    @Override
    public BurgerCook with_tomato() {
        return null;
    }

    @Override
    public Burger cook() {
        return null;
    }

}
