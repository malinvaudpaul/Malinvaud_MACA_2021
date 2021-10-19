package td2.fichiers;

public class Fichier extends ComposantImpl implements IComposant{

    private StringBuilder content ;

    public Fichier(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void appendContent(String name) {

    }

    @Override
    public boolean isComposite() {
        return false;
    }
}
