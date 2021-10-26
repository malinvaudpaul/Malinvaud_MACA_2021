package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Client implements PrePostVisitable, Visitable {
    private String name ;
    private Collection<Commande> commandes ;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashSet<>();
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
            Commande commande = this.commandes.iterator().next() ;
            if(commande.getName().equals(name)){
                commande.addLigne(ligne);
            }
        }
    }

    @Override
    public void accept(PrePostVisitor v) {
        Iterator iterator = this.commandes.iterator();
        System.out.println("<client>");
        while(iterator.hasNext()) {
            Commande commande = this.commandes.iterator().next() ;
            commande.accept(v);
        }
        System.out.println("</client>");
    }

    @Override
    public void accept(Visitor v) {
        Iterator iterator = this.commandes.iterator();
        while(iterator.hasNext()) {
            Commande commande = this.commandes.iterator().next() ;
            System.out.println(String.format("Le client %s ",this.getName()));
            commande.accept(v);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(commandes, client.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, commandes);
    }
}
