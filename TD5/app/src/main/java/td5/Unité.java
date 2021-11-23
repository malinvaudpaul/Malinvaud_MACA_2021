package td5;

public class Unité {
    private Attaque attaqueStrategy;
    private Déplacement déplacementStrategy;

    public Unité() {
    }

    public Unité(Attaque attaqueStrategy, Déplacement déplacementStrategy) {
        this.attaqueStrategy = attaqueStrategy;
        this.déplacementStrategy = déplacementStrategy;
    }

    public void setAttaqueStrategy(Attaque attaqueStrategy) {
        this.attaqueStrategy = attaqueStrategy;
    }

    public void setDéplacementStrategy(Déplacement déplacementStrategy) {
        this.déplacementStrategy = déplacementStrategy;
    }

    public void combattre() {
        this.attaqueStrategy.attaquer();
    }

    public void seDéplacer() {
        this.déplacementStrategy.déplacer();
    }
}
