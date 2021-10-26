package td2.refactorforums;

public abstract interface Composant<T> {
    String sujet() ;
    void add(T child);
    void remove(int index);
    int size();
}
