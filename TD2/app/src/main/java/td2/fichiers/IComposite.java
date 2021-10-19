package td2.fichiers;

import java.util.List;

public interface IComposite<T> {
    List<T> getChildren() ;
    void addChild(T t) ;
    boolean removeChild(T t) ;
    boolean removeChildren(List<T> t) ;
}
