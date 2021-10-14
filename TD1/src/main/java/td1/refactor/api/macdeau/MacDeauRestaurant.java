package td1.refactor.api.macdeau;

import td1.refactor.api.general.*;

public class MacDeauRestaurant implements BurgerRestaurant {
    private static MacDeauRestaurant instance ;

    private MacDeauRestaurant(){

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
