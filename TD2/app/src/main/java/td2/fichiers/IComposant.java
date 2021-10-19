package td2.fichiers;

public interface IComposant {
    String getName();
    Owner getOwner() ;
    void setOwner(Owner owner, boolean recursive);
    int getSize() ;
    String getContent() ;
    void appendContent(String name) ;
    boolean isComposite();
}
