package td2.fichiers;

public class Composant implements IComposant{
    private ComposantType type ;
    private String name ;
    private String content ;
    private int size ;
    private Owner proprio ;

    public Composant(ComposantType type, String name, Owner proprio) {
        this.type = type;
        this.name = name;
        this.content = "";
        this.size = 0 ;
        this.proprio = proprio;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Owner getOwner() {
        return null;
    }

    @Override
    public void setOwner(Owner owner, boolean recursive) {

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
