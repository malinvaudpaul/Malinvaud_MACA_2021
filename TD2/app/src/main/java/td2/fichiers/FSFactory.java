package td2.fichiers;

public class FSFactory {
    private static final FSFactory INSTANCE= new FSFactory();

    private FSFactory(){} ;

    public static FSFactory getInstance(){
        return INSTANCE ;
    }
}
