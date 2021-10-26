package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.Collection;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name ;
    private Collection<Client> clients ;

    public GroupeClient(String name) {
        this.name = name;
    }

    public void addClient(Client client){

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
