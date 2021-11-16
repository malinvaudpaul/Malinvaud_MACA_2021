package td4.state.exercice2;

import td4.state.IncorrectStateException;

public class VendingMachineStateEnough extends VendingMachineState{
    private static final VendingMachineState INSTANCE = new VendingMachineStateEnough();

    private VendingMachineStateEnough() {}

    public static VendingMachineState getInstance() {
        return INSTANCE ;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        c.setState(VendingMachineStateChoice.getInstance());
        c.setCash(c.getCash() - 10);
        System.out.println("ok");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        c.setState(VendingMachineStateChoice.getInstance());
        c.setCash(c.getCash() - 10);
        System.out.println("ok");
    }
}
