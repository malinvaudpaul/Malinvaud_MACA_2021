package td1.refactor.api.general;

public interface BurgerCook {
    BurgerCook with_cheese();
    BurgerCook with_onions();
    BurgerCook with_sauce(Sauce.SauceType sauce);
    BurgerCook with_tomato();
    Burger cook();
}
