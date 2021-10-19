package td2.fichiers;

import java.util.List;

public class Repertoire extends ComposantImpl implements IComposant, IComposite {
    private List<IComposant> children ;

    public Repertoire(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public void setOwner(Owner owner, boolean recursive) {
        this.owner = owner ;
        if(recursive && isComposite()){
            for(IComposant c : children){
                c.setOwner(owner);
            }
        }
    }

    @Override
    public int getSize() {
        return children.getSize();
    }

    @Override
    public String getContent() {
        return children.getName();
    }

    @Override
    public void appendContent(String name) {

    }

    @Override
    public List getChildren() {
        return children;
    }

    @Override
    public void addChild(Object o) {

    }

    @Override
    public boolean removeChild(Object o) {
        return false;
    }

    @Override
    public boolean removeChildren(List t) {
        return false;
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
