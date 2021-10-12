package td1.refactor.api.general;

public enum MeatType implements FoodConstituent{
    BEEF, WHITEFISH;

    public double price() {
        double rtr ;
        switch (this) {
            case WHITEFISH:
                rtr = 6;
                break;
            case BEEF:
            default:
                rtr = 4;
        }
        return rtr;
    }

    @Override
    public double calories_per_100g() {
        double rtr ;
        switch (this){
            case BEEF:
                rtr = 200 ;
                break;
            case WHITEFISH:
                rtr = 170;
                break;
            default:
                rtr = 0 ;
        }
        return rtr;
    }
}
