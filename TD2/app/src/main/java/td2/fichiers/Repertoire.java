package td2.fichiers;

import java.util.List;

public class Repertoire extends ComposantImpl implements IComposant, IComposite {

    public Repertoire(String name, Owner owner) {
        super(name, owner);
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

    @Override
    public List getChildren() {
        return null;
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
}
