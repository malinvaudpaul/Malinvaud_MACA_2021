package td3.visitorsImplements;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.visitors.Visitor;

public class PrintRapportCommandes implements Visitor {
    public PrintRapportCommandes() {
    }

    @Override
    public void visit(GroupeClient gc) {

    }

    @Override
    public void visit(Client client) {

    }

    @Override
    public void visit(Commande commande) {

    }

    @Override
    public void visit(Ligne ligne) {

    }
}
