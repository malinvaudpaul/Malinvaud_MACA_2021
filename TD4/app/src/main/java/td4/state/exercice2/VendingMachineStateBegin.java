package td4.state.exercice2;

import td4.state.IncorrectStateException;

public class VendingMachineStateBegin extends VendingMachineState{
    private static final VendingMachineState INSTANCE = new VendingMachineStateBegin() ;

    private VendingMachineStateBegin() {}

    public static VendingMachineState getInstance() {
        return INSTANCE ;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {

    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        return 0;
    }
}
