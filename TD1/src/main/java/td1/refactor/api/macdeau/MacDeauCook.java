package td1.refactor.api.macdeau;

import td1.refactor.api.general.Burger;
import td1.refactor.api.general.FoodProduct;

import java.util.List;

public class MacDeauCook {
    private String name ;
    private List<FoodProduct> products ;

    public MacDeauCook(String name, List<FoodProduct> products) {
        this.name = name;
        this.products = products;
    }



    public Burger cook(){
        return Burger ;
    }
}
