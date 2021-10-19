package td2.fichiers;

public class Fichier extends ComposantImpl implements IComposant{

    private StringBuilder content ;

    public Fichier(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public int getSize() {
        return content.length();
    }

    @Override
    public String getContent() {
        return content.toString();
    }

    @Override
    public void appendContent(String name) {
        content.append(name);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
