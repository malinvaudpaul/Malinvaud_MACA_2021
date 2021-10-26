package td2.refactorforums;

import java.util.ArrayList;
import java.util.List;

public class Theme implements Composant<Salon>{
    public final String topic ;
    public List<Salon> children ;

    public Theme(String topic) {
        this.topic = topic;
        children = new ArrayList<>();
    }

    @Override
    public String sujet() {
        return this.topic;
    }

    @Override
    public void add(Salon child) {
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
        forum.append("Theme: ");
        forum.append(topic);
        forum.append("\n");
        this.children.forEach(c -> {
            forum.append(c);
        });
        return forum.toString() ;
    }
}
