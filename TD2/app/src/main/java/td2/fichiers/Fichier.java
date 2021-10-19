package td2.fichiers;

public final class Fichier extends ComposantImpl implements Composant{

    private final StringBuilder content ;

    Fichier(String name, Owner owner) {
        super(name, owner);
        content = new StringBuilder() ;
    }

    @Override
    public int getSize() {
        return this.content.length();
    }

    @Override
    public String getContent() {
        return this.content.toString();
    }

    @Override
    public void appendContent(String content) {
        this.content.append(content);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String toString() {
        return getContent();
    }
}
