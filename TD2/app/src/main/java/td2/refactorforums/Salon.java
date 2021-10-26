package td2.refactorforums;

import td2.forums.Theme;

import java.util.ArrayList;
import java.util.List;

public class Salon implements Composant <Message>{
    public final String topic ;
    public List<Message> children ;

    public Salon(String topic) {
        this.topic = topic;
        children = new ArrayList<>();
    }

    @Override
    public String sujet() {
        return this.topic;
    }

    @Override
    public void add(Message child) {
        this.children.add(child);
    }

    @Override
    public void remove(int index) {
        this.children.remove(index);
    }

    @Override
    public int size() {
        return this.children.size() ;
    }

    @Override
    public String toString() {
        StringBuilder forum = new StringBuilder();
        forum.append("Salon: ");
        forum.append(topic);
        forum.append("\n");
        this.children.forEach(c -> {
            forum.append(c);
        });
        return forum.toString() ;
    }
}
