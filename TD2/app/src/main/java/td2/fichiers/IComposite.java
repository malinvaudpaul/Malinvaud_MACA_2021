package td2.fichiers;

import java.util.List;

public interface IComposite {
    void addChild() ;
    List<Composant> getChildren() ;
    void removeChild() ;
    void removeChildren() ;
}
