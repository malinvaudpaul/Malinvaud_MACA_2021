package td5;

public class Soldat extends Unité{
    public Soldat() {
        attaqueStrategy = new Mitraillette();
        déplacementStrategy = new Courir();
    }
}
