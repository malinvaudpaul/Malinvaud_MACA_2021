package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.*;

public class GroupeClient implements PrePostVisitable, Visitable {
    private final String name ;
    private final Map<String, Client> clients ;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Client> getClients() {
        return clients;
    }

    public void addClient(Client client){
        this.clients.put(client.getName(),client);
    }

    public void addCommande(String name, Commande commande){
        Client c = this.clients.get(name) ;
        if(c!= null){c.addCo(name, commande);}
        //else throw new MonException("commande inconnue");
    }

    public void addLigne(String name, String commande, Ligne ligne){
        Iterator iterator = this.clients.iterator();
        while(iterator.hasNext()) {
            Client client = this.clients.iterator().next() ;
            if(client.getName().equals(name)){
                client.addLigne(commande, ligne);
            }
        }
    }

    @Override
    public void accept(PrePostVisitor v) {
        v.preVisit(this);
        for(Client c: clients.values()) c.accept(v);
        v.postVisit(this);
    }

    @Override
    public void accept(Visitor v) {
        for(Client c: clients.values()) c.accept(v);
        v.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupeClient that = (GroupeClient) o;
        return Objects.equals(name, that.name) && Objects.equals(clients, that.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clients);
    }
}
