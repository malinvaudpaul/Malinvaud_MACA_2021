package td2.fichiers;

public class FSFactory {
    private static final FSFactory INSTANCE= new FSFactory();

    private FSFactory(){} ;

    public static FSFactory getInstance(){
        return INSTANCE ;
    }

    public Composant createComposant(ComposantType type, String name, Owner proprio){
        return new Composant(type, name, proprio);
    }
}
