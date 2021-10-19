package td2.forums;

import java.util.ArrayList;
import java.util.List;

public class Theme {
    public final String topic ;
    public List<Salon> children ;

    public Theme(String topic) {
        this.topic = topic;
        children = new ArrayList<>();
    }

    public String sujet(){
        return this.topic;
    }

    public void add(Salon child){
        this.children.add(child);
    }

    public void remove(int index){
        this.children.remove(index);
    }

    public int size(){
        return this.children.size() ;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "topic='" + topic + '\'' +
                ", children=" + children +
                '}';
    }
}
