package td5;

public class Char extends Unité{
    public Char() {
        attaqueStrategy = new Canon();
        déplacementStrategy = new Rouler();
    }
}
