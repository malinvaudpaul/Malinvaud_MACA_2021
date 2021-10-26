package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

public class Client implements PrePostVisitable, Visitable {
    private String name ;

    public Client(String name) {
        this.name = name;
    }

    public void addCommande(Commande commande){

    }

    public void addLigne(String string, Ligne ligne){

    }

    @Override
    public void accept(PrePostVisitor v) {

    }

    @Override
    public void accept(Visitor v) {

    }
}
