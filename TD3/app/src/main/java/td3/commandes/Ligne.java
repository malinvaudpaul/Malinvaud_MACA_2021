package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {
    private String name ;
    private int sum ;

    public Ligne(String name) {
        this.name = name;
    }

    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public void accept(PrePostVisitor v) {

    }

    @Override
    public void accept(Visitor v) {

    }
}
