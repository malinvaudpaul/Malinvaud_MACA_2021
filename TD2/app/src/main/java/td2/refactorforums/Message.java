package td2.refactorforums;

public class Message implements Composant{
    public final String topic ;
    public final String contenu ;

    public Message(String topic, String contenu) {
        this.topic = topic;
        this.contenu = contenu;
    }

    @Override
    public String sujet(){
        return this.topic;
    }

    @Override
    public String toString() {
        return "Message:" + topic + '\n' + contenu + '\n';
    }
}
