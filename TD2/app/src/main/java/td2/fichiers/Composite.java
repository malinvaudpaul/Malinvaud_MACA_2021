package td2.fichiers;

import java.util.List;

public class Composite<T> implements IComposite{
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
