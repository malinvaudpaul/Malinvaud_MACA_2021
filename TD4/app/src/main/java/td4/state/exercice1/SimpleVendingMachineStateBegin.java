package td4.state.exercice1;

import td4.state.IncorrectStateException;

public class SimpleVendingMachineStateBegin extends SimpleVendingMachineState{
    private static final SimpleVendingMachineState INSTANCE = new SimpleVendingMachineStateBegin() ;

    private SimpleVendingMachineStateBegin() {}

    public static SimpleVendingMachineState getInstance() {
        return INSTANCE ;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        if(c.getMoney() + money < 10) {
            c.addMoney(money);
        }
        else {
            c.addMoney(money);
            c.setState(SimpleVendingMachineStateChoice.getInstance());
        }
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("pas possible");
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("pas possible");
    }
}
