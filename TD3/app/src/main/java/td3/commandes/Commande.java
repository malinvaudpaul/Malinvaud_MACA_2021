package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.ArrayList;
import java.util.Collection;

public class Commande implements PrePostVisitable, Visitable {
    private String name ;
    private Collection<Ligne> lignes ;

    public Commande(String name) {
        this.name = name;
        this.lignes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne ligne){
        this.lignes.add(ligne);
    }

    @Override
    public void accept(PrePostVisitor v) {

    }

    @Override
    public void accept(Visitor v) {

    }
}
