package td3.commandes;

import td3.visitables.PrePostVisitable;
import td3.visitables.Visitable;
import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Commande implements PrePostVisitable, Visitable {
    private String name ;
    private Collection<Ligne> lignes ;

    public Commande(String name) {
        this.name = name;
        this.lignes = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne ligne){
        this.lignes.add(ligne);
    }

    @Override
    public void accept(PrePostVisitor v) {
        Iterator iterator = this.lignes.iterator();
        System.out.println("<ligne>");
        while(iterator.hasNext()) {
            Ligne ligne = this.lignes.iterator().next() ;
            ligne.accept(v);
        }
        System.out.println("</ligne>");
    }

    @Override
    public void accept(Visitor v) {
        Iterator iterator = this.lignes.iterator();
        int sum = 0 ;
        while(iterator.hasNext()) {
            Ligne ligne = this.lignes.iterator().next() ;
            sum += ligne.getSum() ;
        }
        System.out.println(String.format("doit %d euros",sum));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return Objects.equals(name, commande.name) && Objects.equals(lignes, commande.lignes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lignes);
    }
}
