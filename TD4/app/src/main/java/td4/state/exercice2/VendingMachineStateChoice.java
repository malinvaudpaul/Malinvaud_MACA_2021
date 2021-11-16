package td4.state.exercice2;

import td4.state.IncorrectStateException;
import td4.state.exercice1.SimpleVendingMachineContext;
import td4.state.exercice1.SimpleVendingMachineState;
import td4.state.exercice1.SimpleVendingMachineStateBegin;

public class VendingMachineStateChoice extends VendingMachineState {
    private static final VendingMachineState INSTANCE = new VendingMachineStateChoice();

    private VendingMachineStateChoice() {}

    public static VendingMachineState getInstance() {
        return INSTANCE ;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        System.out.println("il est temps de faire un choix");
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("il est temps de faire un choix");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("il est temps de faire un choix");
    }
}
