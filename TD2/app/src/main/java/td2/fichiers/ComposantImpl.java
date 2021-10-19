package td2.fichiers;

public class ComposantImpl implements IComposant{
    private final String name ;
    private Owner owner ;

    public ComposantImpl(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
