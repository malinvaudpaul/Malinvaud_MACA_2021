package td5;

public class Helicoptère extends Unité{
    public Helicoptère() {
        attaqueStrategy = new Missile();
        déplacementStrategy = new Voler();
    }
}
