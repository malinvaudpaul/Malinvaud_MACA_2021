package td1.refactor.api.bigburger;

import td1.refactor.api.general.BurgerRestaurant;

public class BigBurgerRestaurant implements BurgerRestaurant {
    private static BigBurgerRestaurant instance ;

    private BigBurgerRestaurant(){

    }

    public static BurgerRestaurant queue(){
        if(instance == null){

        }
    }
}
