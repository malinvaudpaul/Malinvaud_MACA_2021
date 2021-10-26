package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name ;
    private Collection<Client> clients ;

    public GroupeClient(String name) {
        this.name = name;
        this.clients = new HashSet<>();
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public void addCommande(String name, Commande commande){
        Iterator iterator = this.clients.iterator();
        while(iterator.hasNext()) {
            Client client = this.clients.iterator().next() ;
            if(client.getName().equals(name)){
                client.addCommande(commande);
            }
        }
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
        Iterator iterator = this.clients.iterator();
        System.out.println("<groupe>");
        while(iterator.hasNext()) {
            Client client = this.clients.iterator().next() ;
            client.accept(v);
        }
        System.out.println("</groupe>");
    }

    @Override
    public void accept(Visitor v) {
        Iterator iterator = this.clients.iterator();
        while(iterator.hasNext()) {
            Client client = this.clients.iterator().next() ;
            client.accept(v);
        }
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
