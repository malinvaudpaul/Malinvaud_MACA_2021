package td1.refactor.api.general;

public enum SauceType implements FoodConstituent{
    BURGER, BARBECUE, BEARNAISE;

    @Override
    public double calories_per_100g() {
        double rtr ;
        switch (this) {
            case BURGER:
                rtr = 240;
                break;
            case BARBECUE:
                rtr = 130;
                break;
            case BEARNAISE:
                rtr = 550;
                break;
            default:
                rtr = 0;
        }
        return rtr;
    }
}
