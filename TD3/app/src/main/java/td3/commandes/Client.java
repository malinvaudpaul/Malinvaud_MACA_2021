package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Client implements PrePostVisitable, Visitable {
    private String name ;
    private Collection<Commande> commandes ;

    public Client(String name) {
        this.name = name;
        this.commandes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande commande){
        this.commandes.add(commande);
    }

    public void addLigne(String name, Ligne ligne){
        Iterator iterator = this.commandes.iterator();
        while(iterator.hasNext()) {
            if(this.commandes.iterator().next().getName().equals(name)){
                this.commandes.iterator().next().addLigne(ligne);
            }
        }
    }

    @Override
    public void accept(PrePostVisitor v) {

    }

    @Override
    public void accept(Visitor v) {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
