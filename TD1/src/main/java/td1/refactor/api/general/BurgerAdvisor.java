package td1.refactor.api.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerAdvisor {
    private static final BurgerAdvisor instance = new BurgerAdvisor();
    private static final Map<Tariff, List<BurgerRestaurant>> registry = new HashMap<>();

    private BurgerAdvisor() {

    }
    public static BurgerAdvisor instance(){
        return instance;
    }
    public static void register(Tariff tariff, BurgerRestaurant restaurant){
        if(!registry.containsKey(tariff)){
            registry.put(tariff, new ArrayList<>());
        }
        registry.get(tariff).add(restaurant);
    }

    public BurgerRestaurant select(Tariff tariff){
        return registry.get(tariff).get(0);
    }
}
