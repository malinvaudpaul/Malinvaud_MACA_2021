package td2.fichiers;

public interface IComposant {
    String getName();
    String getContent() ;
    Owner getOwner() ;
    int getSize() ;
    void appendContent(String chaine) ;
    void setOwner(Owner proprio);
}
