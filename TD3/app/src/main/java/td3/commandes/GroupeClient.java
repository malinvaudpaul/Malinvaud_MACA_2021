package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name ;
    private Collection<Client> clients ;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public void addCommande(String name, Commande commande){
        Iterator iterator = this.clients.iterator();
        while(iterator.hasNext()) {
            if(this.clients.iterator().next().getName().equals(name)){
                this.clients.iterator().next().addCommande(commande);
            }
        }
    }

    public void addLigne(String name, String commande, Ligne ligne){
        Iterator iterator = this.clients.iterator();
        while(iterator.hasNext()) {
            if(this.clients.iterator().next().getName().equals(name)){
                this.clients.iterator().next().addLigne(commande, ligne);
            }
        }
    }

    @Override
    public void accept(PrePostVisitor v) {

    }

    @Override
    public void accept(Visitor v) {

    }
}
