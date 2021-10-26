package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.Objects;

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

    public int getSum() {
        return sum;
    }

    @Override
    public void accept(PrePostVisitor v) {

    }

    @Override
    public void accept(Visitor v) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ligne ligne = (Ligne) o;
        return sum == ligne.sum && Objects.equals(name, ligne.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum);
    }
}
