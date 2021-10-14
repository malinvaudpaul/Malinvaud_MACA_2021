package td1.refactor.api.bigburger;

import td1.refactor.api.general.*;

public class BigBurgerRestaurant implements BurgerRestaurant {
    private static BigBurgerRestaurant instance ;

    private BigBurgerRestaurant(){

    }

    public static BurgerRestaurant queue(){
        if(instance == null){

        }
        return null ;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        return null;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return null;
    }
}
