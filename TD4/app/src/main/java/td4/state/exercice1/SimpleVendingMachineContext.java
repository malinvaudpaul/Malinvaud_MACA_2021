package td4.state.exercice1;

import td4.state.IncorrectStateException;

/**
 * Created with IntelliJ IDEA. User: pascalpoizat Date: 09/12/2013 Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class SimpleVendingMachineContext {
    private SimpleVendingMachineState current;
    private int money ;

    public SimpleVendingMachineContext() {
        current = SimpleVendingMachineStateBegin.getInstance();
        money = 0 ;
    }

    void setState(SimpleVendingMachineState s) {
        current = s;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money ;
    }

    public void give(int money) throws IncorrectStateException {
        current.give(this, money);
    }

    public void askCoffee() throws IncorrectStateException {
        current.askCoffee(this);
    }

    public void askTea() throws IncorrectStateException {
        current.askTea(this);
    }

}
