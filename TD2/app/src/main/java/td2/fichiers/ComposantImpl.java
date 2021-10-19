package td2.fichiers;

public abstract class ComposantImpl implements IComposant{
    private final String name ;
    public Owner owner ;

    public ComposantImpl(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Owner getOwner() {
        return owner;
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
